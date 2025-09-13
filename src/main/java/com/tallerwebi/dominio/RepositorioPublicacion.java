package com.tallerwebi.dominio;

import org.springframework.stereotype.Repository;

import java.util.List;



public interface RepositorioPublicacion {

    List<Publicacion> findAll();
  /*Cuando haya fechas, buscar max 20/30 por fecha reciente */



}
