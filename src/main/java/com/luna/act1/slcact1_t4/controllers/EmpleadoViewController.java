package com.luna.act1.slcact1_t4.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luna.act1.slcact1_t4.models.dto.EmpleadoDTO;

@Controller
@RequestMapping("/empleados")
public class EmpleadoViewController {

    // @Value: lee la propiedad config.autor de application.properties
    @Value("${config.autor}")
    private String autor;

    // Lista de empleados guardada en memoria
    private List<EmpleadoDTO> empleados = new ArrayList<>();

    public EmpleadoViewController() {
        empleados.add(new EmpleadoDTO(1, "Sarai", "Luna", "Gerente", 21));
        empleados.add(new EmpleadoDTO(2, "Leonel", "Carrasco", "Secretario", 40));
        empleados.add(new EmpleadoDTO(3, "Lorena", "Hernandez", "Secretario", 40));
    }

    // Lista de empleados. Con /empleados?puesto=Secretario filtra (@RequestParam)
    @GetMapping
    public String lista(@RequestParam(name = "puesto", required = false) String puesto, Model model) {
        List<EmpleadoDTO> resultado = new ArrayList<>();
        for (EmpleadoDTO e : empleados) {
            if (puesto == null || puesto.isEmpty() || e.getPuesto().equalsIgnoreCase(puesto)) {
                resultado.add(e);
            }
        }
        model.addAttribute("empleados", resultado);
        model.addAttribute("autor", autor);
        return "empleados/lista";
    }

    // Detalle de un empleado por su id (@PathVariable)
    @GetMapping("/{id}")
    public String detalle(@PathVariable("id") int id, Model model) {
        EmpleadoDTO encontrado = null;
        for (EmpleadoDTO e : empleados) {
            if (e.getId() == id) {
                encontrado = e;
            }
        }
        model.addAttribute("empleado", encontrado);
        model.addAttribute("autor", autor);
        return "empleados/detalle";
    }

    // Muestra el formulario vacío
    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("empleado", new EmpleadoDTO());
        model.addAttribute("autor", autor);
        return "empleados/formulario";
    }

    // Recibe los datos del formulario (@ModelAttribute) y los guarda en la lista
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("empleado") EmpleadoDTO empleado) {
        empleado.setId(empleados.size() + 1);
        empleados.add(empleado);
        return "redirect:/empleados";
    }
}
