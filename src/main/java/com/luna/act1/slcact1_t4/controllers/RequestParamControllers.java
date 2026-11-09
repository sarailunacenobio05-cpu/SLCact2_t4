package com.luna.act1.slcact1_t4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/api/parametros")
public class RequestParamControllers {
    @GetMapping ("/detalle")
    public ParametroDTO detalle(@RequestParam(required = false , defaultValue = "holis") String informacion){
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(informacion);
        return parametro1;

    }

}
