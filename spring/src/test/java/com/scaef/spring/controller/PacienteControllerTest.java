package com.scaef.spring.controller;

import static com.scaef.spring.utils.PacienteUtils.asJsonString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.scaef.spring.dto.MessageResponseDTO;
import com.scaef.spring.dto.PacienteDTO;
import com.scaef.spring.service.PacienteService;
import com.scaef.spring.utils.PacienteUtils;

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
import org.springframework.http.MediaType;

@ExtendWith(MockitoExtension.class)
public class PacienteControllerTest{

    public static final String PACIENTE_API_URL_PATH = "/api/v1/Paciente";
    private MockMvc mockMvc;

    @Mock
    private PacienteService pacienteService;

    @InjectMocks
    private PacienteController pacienteController;

    @BeforeEach
    void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(pacienteController)
            .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
            .setViewResolvers((viewName, Locale) -> new MappingJackson2JsonView())
            .build();
    }

    @Test
    void testWhenPostMapisCalledThenAPatientShouldBeRegistered() throws Exception  {
        PacienteDTO pacienteDTO = PacienteUtils.createFakePacienteDTO();

        MessageResponseDTO expectedMessageResponse = MessageResponseDTO.builder()
        .message("Paciente " + pacienteDTO.getNome() + " cadastrado com a ID = " + pacienteDTO.getId())
        .build();

        when(pacienteService.create(pacienteDTO)).thenReturn(expectedMessageResponse);

        mockMvc.perform(post(PACIENTE_API_URL_PATH)
        .contentType(MediaType.APPLICATION_JSON)
        .content(asJsonString(pacienteDTO)))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.message", Is.is(expectedMessageResponse.getMessage())));
    }
}