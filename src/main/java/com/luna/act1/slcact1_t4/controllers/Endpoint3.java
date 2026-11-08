package com.luna.act1.slcact1_t4.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Endpoint3 {
    @GetMapping("/detalles_info3")
    
    
    public Map<String, Object> detalles_info3(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Semestre","7");
        respuesta.put("Materia 1","Gestion de proyectos de software");
        respuesta.put("Materia 2","Programacion web");
        respuesta.put("Materia 3","Conmutacion");
        respuesta.put("Materia 4","Sistemas Programables");
        respuesta.put("Materia 5","Taller de investigacion");
        respuesta.put("Materia 6","PLF");


        return respuesta;
    }
    
    

}
