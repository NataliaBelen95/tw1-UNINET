package com.tallerwebi.dominio;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServicioUsuario {

    private final RepositorioUsuario repositorio;

    public ServicioUsuario(RepositorioUsuario repositorio) {
        this.repositorio = repositorio;
    }

    @Transactional
    public Usuario getUsuarioConCarreras(String email) {
        Usuario usuario = repositorio.buscar(email);
        if (usuario == null) {
            throw new RuntimeException("Usuario no encontrado");
        }
        usuario.getCarreras().size(); // fuerza la inicialización de la colección LAZY
        return usuario;
    }
}