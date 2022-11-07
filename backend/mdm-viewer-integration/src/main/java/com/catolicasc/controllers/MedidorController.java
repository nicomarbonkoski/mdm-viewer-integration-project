package com.catolicasc.controllers;
 
import java.util.*;
 
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.catolicasc.entities.Medidor;
import com.catolicasc.service.MedidorService;
 
@RestController
public class MedidorController {
 
    @Autowired
    private MedidorService service;
     
    // RESTful API methods for Retrieval operations
    
    @GetMapping("/medidores")
    public List<Medidor> list() {
    	System.out.println("Metodo get em /medidores");
    	// Retorna uma lista com todos os medidores
        return service.listAll();
    }
    
    @GetMapping("/medidores/{id}")
    public ResponseEntity<Medidor> get(@PathVariable int id) {
    	System.out.println("Metodo get em /medidores/id");
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
    	System.out.println("Método post em /medidores");
        service.save(medidor);
    }
    
    // RESTful API method for Update operation
    
    @PutMapping("/medidores/{id}")
    public ResponseEntity<?> update(@RequestBody Medidor medidor, @PathVariable int id) {
        try {
        	System.out.println("Método update em /medidores/id");
//            Medidor existeMedidor = service.get(id); // No guia essa linha de código existia, mas ela não afeta em nada o funcionamento
            service.save(medidor);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Delete operation
    
    @DeleteMapping("/medidores/{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("Metodo delete /medidores/id");
        service.delete(id);
    }
}