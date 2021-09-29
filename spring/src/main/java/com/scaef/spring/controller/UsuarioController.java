package com.scaef.spring.controller;

import com.scaef.spring.dto.MessageResponseDTO;
import com.scaef.spring.dto.UsuarioDTO;
import com.scaef.spring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;


@RestController
@RequestMapping("/api/v1/Usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    
    @PostMapping
        public MessageResponseDTO create(@RequestBody @Valid UsuarioDTO usuarioDTO){
        return usuarioService.create(usuarioDTO);
    }
}