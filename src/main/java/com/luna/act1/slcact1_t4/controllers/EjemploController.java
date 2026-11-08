package com.luna.act1.slcact1_t4.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class EjemploController {
    @GetMapping("/detalles_info")
    
    
    public String info(Map<String, Object> model){
        model.put("Actividad","Act1. Introduccion a Spring Boot");
        model.put("Estudiante","Sarai Luna Cenobio");
        model.put("Grupo","7SD");
        return "detalles_info";
    }

}
