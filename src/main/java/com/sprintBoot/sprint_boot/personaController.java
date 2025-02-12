package com.sprintBoot.sprint_boot;

import org.springframework.web.bind.annotation.*;

@RestController
public class personaController {

    @PostMapping("/crear")
    public String guardarPersona (@RequestBody Persona p){
        System.out.println("El nombre de la persona es:");
        System.out.println(p.getName());
        return "Persona creada...";
    }
}

