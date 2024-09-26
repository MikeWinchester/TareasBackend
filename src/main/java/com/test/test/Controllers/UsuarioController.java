package com.test.test.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.test.Models.Usuario;
import com.test.test.Services.Impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl UsuarioServiceImpl;

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuarioAuth){
        return this.UsuarioServiceImpl.login(usuarioAuth);
    }
    
}
