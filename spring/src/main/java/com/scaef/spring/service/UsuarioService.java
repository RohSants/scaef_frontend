package com.scaef.spring.service;

import com.scaef.spring.dto.MessageResponseDTO;
import com.scaef.spring.dto.UsuarioDTO;
import com.scaef.spring.entity.Usuario;
import com.scaef.spring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    
    @Autowired
	public UsuarioService(UsuarioRepository usuarioRepository){
		this.usuarioRepository  = usuarioRepository;
}