package com.test.test.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test.Models.Usuario;
import com.test.test.Repositories.UsuarioRepository;
import com.test.test.Services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario login(Usuario usuario) {
        Usuario usuarioAuth = this.usuarioRepository.findByCorreo(usuario.getCorreo());
        if(usuarioAuth != null){
            if(usuario.getContrasenia().equals(usuarioAuth.getContrasenia())){
                return usuarioAuth;
            }
        }else{
            return null;
        }
        return null;

    }
    
}
