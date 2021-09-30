package com.scaef.spring.mapper;

import com.scaef.spring.dto.UsuarioDTO;
import com.scaef.spring.entity.Usuario;
import com.scaef.spring.entity.Usuario.UsuarioBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-30T00:22:29-0400",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17 (Oracle Corporation)"
)
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public Usuario toModel(UsuarioDTO usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        UsuarioBuilder usuario = Usuario.builder();

        usuario.celular( usuarioDTO.getCelular() );
        usuario.cpf( usuarioDTO.getCpf() );
        usuario.crf( usuarioDTO.getCrf() );
        usuario.email( usuarioDTO.getEmail() );
        usuario.fone( usuarioDTO.getFone() );
        usuario.funcao( usuarioDTO.getFuncao() );
        usuario.id( usuarioDTO.getId() );
        usuario.nome( usuarioDTO.getNome() );
        usuario.rg( usuarioDTO.getRg() );

        return usuario.build();
    }
}
