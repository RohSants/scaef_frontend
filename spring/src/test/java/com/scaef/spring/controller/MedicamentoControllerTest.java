package com.scaef.spring.controller;

import com.scaef.spring.service.MedicamentoService;
import com.scaef.spring.utils.MedicamentoUtils;
import com.scaef.spring.dto.MedicamentoDTO;
import com.scaef.spring.dto.MessageResponseDTO;

import org.springframework.http.MediaType;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.
MockMvcResultMatchers.status;
import static com.scaef.spring.utils.MedicamentoUtils.asJsonString;
/*import static com.scaef.spring.utils.MedicamentoUtils.createFakeMedicamentoDTO;*/



@ExtendWith(MockitoExtension.class)
public class MedicamentoControllerTest {

    private static final String MEDICAMENTO_API_URL_PATH = "/api/v1/Medicamento";
    
    private MockMvc mockMvc;

    @Mock
    private MedicamentoService medicamentoService;

    @InjectMocks
    private MedicamentoController medicamentoController;


    @BeforeEach
        void setUp(){
            mockMvc = MockMvcBuilders.standaloneSetup(medicamentoController)
            .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
            .setViewResolvers((viewName, locale) -> new MappingJackson2JsonView())
            .build();
        }

        @Test
        void testWhenPostMapisCalledThenADrugShouldBeRegistered() throws Exception {
            MedicamentoDTO medicamentoDTO =  MedicamentoUtils.createFakeMedicamentoDTO();
            MessageResponseDTO expectedMessageResponse = MessageResponseDTO.builder()
            .message("Medicamento registrado com o código: " + medicamentoDTO.getId())
            .build();

        when(medicamentoService.create(medicamentoDTO)).thenReturn(expectedMessageResponse);

        mockMvc.perform(post(MEDICAMENTO_API_URL_PATH)
        .contentType(MediaType.APPLICATION_JSON)
        .content(asJsonString(medicamentoDTO)))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.message", Is.is(expectedMessageResponse.getMessage())));
        }   
}