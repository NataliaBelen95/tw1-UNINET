package com.tallerwebi.dominio;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioPublicacion {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Publicacion> findAll() {
        Session session = sessionFactory.getCurrentSession();
        // traer todas las publicaciones con su usuario
        return session.createQuery("from Publicacion p join fetch p.usuario", Publicacion.class)
                .getResultList();
    }

}
