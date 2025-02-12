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

@PutMapping("/actualizar")
    public Persona actualizarPersona (@RequestBody Persona p){

        Persona pdb = new Persona();
        pdb.setId(1);
        pdb.setName("Maria");
        pdb.setEdad(23);

        pdb.setId(p.getId());
        pdb.setName(p.getName());
        pdb.setEdad(p.getEdad());



        return pdb;
    }
}

