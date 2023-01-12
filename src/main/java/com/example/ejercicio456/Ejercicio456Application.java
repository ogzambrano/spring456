package com.example.ejercicio456;

import com.example.ejercicio456.controller.LaptopController;
import com.example.ejercicio456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sound.sampled.BooleanControl;

@SpringBootApplication
public class Ejercicio456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio456Application.class, args);
		LaptopController laptopController = new LaptopController(context.getBean(LaptopRepository.class));
		laptopController.datosPrueba();

	}

}
