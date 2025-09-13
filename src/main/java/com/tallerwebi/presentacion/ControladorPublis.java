package com.tallerwebi.presentacion;



/*controlador para mostrar publis */


import com.tallerwebi.dominio.ServicioLogin;
import com.tallerwebi.dominio.ServicioPublicacion;
import com.tallerwebi.dominio.Usuario;
import com.tallerwebi.dominio.excepcion.UsuarioExistente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class ControladorPublis {


    private ServicioPublicacion servicioPublicacion;

    @Autowired
    public ControladorPublis(ServicioPublicacion servicioPublicacion) {
        this.servicioPublicacion = servicioPublicacion;
    }

    @RequestMapping(value = "/publicaciones", method = RequestMethod.GET)
    public ModelAndView findAll() {
        // Llamamos al servicio para obtener la lista de publicaciones
        var listaPublis = servicioPublicacion.findAll();

        // Creamos el ModelAndView
        ModelAndView mav = new ModelAndView("publicaciones"); // "home" es el nombre de la vista (home.jsp o inicio.html)
        mav.addObject("publicaciones", listaPublis); // agregamos la lista al modelo con la key "publicaciones"
        return mav;
    }

}
