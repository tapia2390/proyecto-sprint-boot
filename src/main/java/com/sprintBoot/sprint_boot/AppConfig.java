package com.sprintBoot.sprint_boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public  Transferencia transferencia(){
        return  new TransferenciaBancaria();
    }

    @Bean
    public BancaWeb bancaWeb(){
        return  new BancaWeb(transferencia());
    }
}
