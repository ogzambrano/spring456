package com.example.ejercicio456.controller;

import com.example.ejercicio456.entities.Laptop;
import com.example.ejercicio456.repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class LaptopController {
    //variables
    LaptopRepository laptopRepository;

    //constructor
    public LaptopController(LaptopRepository laptopRepository) {
        //guardar el repositorio
        this.laptopRepository = laptopRepository;

    }
    //getter y setter

    //metodos
    ///generar datos de prueva
    public void datosPrueba(){
        laptopRepository.save(new Laptop("HP","S17", LocalDate.of(2000,2,14),true));
        laptopRepository.save(new Laptop("ASUS","A5.3", LocalDate.of(2000,2,14),true));
    }

    //CRUD

    //mostrar todas las laptop
    @GetMapping("/api/laptops")
    public ResponseEntity<List<Laptop>> findAll(){
        return ResponseEntity.ok(laptopRepository.findAll());
    }
    //guardar laptop que lelga por post
    @PostMapping("/api/laptop")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){
        return ResponseEntity.ok(laptopRepository.save(laptop));
    }




}
