package com.catolicasc.controllers;
 
import java.util.*;
 
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.catolicasc.entities.Medidor;
import com.catolicasc.service.MedidorService;
 
@CrossOrigin(origins = "http://localhost:4200/",maxAge=3600)
@RequestMapping({"/"})

@RestController
public class MedidorController {
 
    @Autowired
    private MedidorService service;
     
    // RESTful API methods for Retrieval operations
    
    @GetMapping("/medidores")
    public List<Medidor> list() {
    	System.out.println("Metodo GET em /medidores");
    	// Retorna uma lista com todos os medidores
        return service.listAll();
    }
    
    @GetMapping("/medidores/{id}")
    public ResponseEntity<Medidor> get(@PathVariable int id) {
    	System.out.println("Metodo GET em /medidores/"+id);
        try {
            Medidor medidor = service.get(id);
            // Retorna apenas o medidor com o id
            return new ResponseEntity<Medidor>(medidor, HttpStatus.OK);
        } catch (NoSuchElementException e) {
        	// retorna um estado de not found
            return new ResponseEntity<Medidor>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Create operation
    
    @PostMapping("/medidores")
    public void add(@RequestBody Medidor medidor) {
    	System.out.println("Método POST em /medidores");
        service.save(medidor);
    }
    
    // RESTful API method for Update operation
    
    @PutMapping("/medidores/{id}")
    public ResponseEntity<?> update(@RequestBody Medidor medidor, @PathVariable int id) {
        try {
        	System.out.println("Método PUT/update em /medidores/"+id);
            medidor.setId(service.get(id).getId()); // Seta o id do medidor que será atualizado como o que está sendo recebido na URL
            service.save(medidor);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Delete operation
    
    @DeleteMapping("/medidores/{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("Metodo DELETE /medidores/"+id);
        service.delete(id);
    }
}