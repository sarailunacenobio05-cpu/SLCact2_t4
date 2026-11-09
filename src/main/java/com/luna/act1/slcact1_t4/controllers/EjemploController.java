package com.luna.act1.slcact1_t4.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.luna.act1.slcact1_t4.models.Empleados;


@Controller 
public class EjemploController {
    @GetMapping("/detalles_info")
    
    
    public String info(Model model){
        Empleados empleado1= new Empleados("Sarai","Luna","Calle 20 de noviembre","Gerente",21,951252456, 1);
        model.addAttribute("empleado", empleado1);        
        return "detalles_info";
    }
    @ModelAttribute ("Empleados")
    public List<Empleados> ListaEmpleados(){
        return Arrays.asList(
            new Empleados("Leonel","Carrasco","Priv Laureles","Secretario",40,951456789,2),
            new Empleados("Lorena","Hernandez","Priv Laureles","Secretario",40,951456789,3)
        );

    }

}
