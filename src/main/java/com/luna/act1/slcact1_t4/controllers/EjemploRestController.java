package com.luna.act1.slcact1_t4.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luna.act1.slcact1_t4.models.Empleados;
import com.luna.act1.slcact1_t4.models.dto.ClaseDTO;

@RestController 
@RequestMapping ("/api")
public class EjemploRestController {
    @GetMapping (path = "/detalles_info2")
    
    
    public ClaseDTO detalles_info2(){
        /*Empleados empleado1= new Empleados("Sarai","Luna","Calle 20 noviembre","Gerente",21,951252456,02);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado","Datos empleado");
        respuesta.put("Info",empleado1);*/
        ClaseDTO usuario1=new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("SaraiLu");
        
        return usuario1;
    }
    
    

}
