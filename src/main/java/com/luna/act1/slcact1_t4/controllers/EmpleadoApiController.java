package com.luna.act1.slcact1_t4.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luna.act1.slcact1_t4.models.dto.EmpleadoDTO;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoApiController {

    // POST que recibe JSON (@RequestBody) y responde JSON con el mismo DTO
    @PostMapping
    public EmpleadoDTO crear(@RequestBody EmpleadoDTO empleado) {
        return empleado;
    }
}
