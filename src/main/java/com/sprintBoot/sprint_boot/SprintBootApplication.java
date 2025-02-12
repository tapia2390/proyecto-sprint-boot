package com.sprintBoot.sprint_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SprintBootApplication {



	public static void main(String[] args) {

		SpringApplication.run(SprintBootApplication.class, args);

		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		BancaWeb bwContenedorSprint = context.getBean(BancaWeb.class);

		//BancaWeb bw = new BancaWeb(new Pago());
		bwContenedorSprint.realizarTransferencia();
		context.close();
	}


}
