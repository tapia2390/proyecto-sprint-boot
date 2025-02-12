package com.sprintBoot.sprint_boot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContrller {

@GetMapping("/hola")
    public String saludar(){
        return "Hola Mundo";
    }

    @GetMapping("/despedir")
    public String depedir (){
        return "Chao Mundo";
    }
}
