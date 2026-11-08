package com.luna.act1.slcact1_t4.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class EjemploRestController {
    @GetMapping("/detalles_info2")
    
    
    public Map<String, Object> detalles_info2(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Nombre","Sarai");
        respuesta.put("Apellidos","Luna Cenobio");
        respuesta.put("Edad","20");
        respuesta.put("Semestre","7");
        respuesta.put("Carrera","Ingenieria en Sistemas Computacionales");
        return respuesta;
    }
    
    

}
