package com.scaef.spring.service;

import com.scaef.spring.dto.MessageResponseDTO;
import com.scaef.spring.dto.UsuarioDTO;
import com.scaef.spring.entity.Usuario;
import com.scaef.spring.mapper.UsuarioMapper;
import com.scaef.spring.service.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    private final UsuarioMapper usuarioMapper = UsuarioMapper.INSTANCE;
    
    @Autowired
	public UsuarioService(UsuarioRepository usuarioRepository){
		this.usuarioRepository  = usuarioRepository;
    }
    
    public MessageResponseDTO create(UsuarioDTO usuarioDTO){
        Usuario usuarioToSave = usuarioMapper.toModel(usuarioDTO);

        Usuario savedUsuario = usuarioRepository.save(usuarioToSave);
        return MessageResponseDTO.builder()
                .message("Usuário cadastrado com sucesso ID =  " + savedUsuario.getId())
                .build();
    }
}