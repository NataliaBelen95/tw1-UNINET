package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.ServicioPublicacion;
import com.tallerwebi.dominio.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class ControladorInicio {

    private final ServicioPublicacion servicioPublicacion;

    public ControladorInicio(ServicioPublicacion servicioPublicacion) {
        this.servicioPublicacion = servicioPublicacion;
    }

    @RequestMapping(path = "/inicio", method = RequestMethod.GET)
    public ModelAndView inicio(HttpSession session) {
        Usuario usuario = (Usuario) session.getAttribute("usuarioLogueado");
        if (usuario == null) {
            return new ModelAndView("redirect:/login");
        }


        ModelAndView mav = new ModelAndView("inicio");
        mav.addObject("usuario", usuario); // 👈 info del login
        mav.addObject("publicaciones", servicioPublicacion.findAll()); // 👈 info de publicaciones
        return mav;
    }
}
