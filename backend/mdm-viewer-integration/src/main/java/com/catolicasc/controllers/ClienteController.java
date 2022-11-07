package com.catolicasc.controllers;
 
import java.util.*;
 
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.catolicasc.entities.Cliente;
import com.catolicasc.service.ClienteService;
 
@RestController
public class ClienteController {
 
    @Autowired
    private ClienteService service;
     
    // RESTful API methods for Retrieval operations
    
    @GetMapping("/clientes")
    public List<Cliente> list() {
    	System.out.println("Metodo GET em /clientes");
    	// Retorna uma lista com todos os clientes
        return service.listAll();
    }
    
    @GetMapping("/clientes/{cpf}")
    public ResponseEntity<Cliente> get(@PathVariable String cpf) {
    	System.out.println("Metodo GET em /clientes/"+cpf);
        try {
            Cliente cliente = service.get(cpf);
            // Retorna apenas o cliente com o cpf indicado
            return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
        } catch (NoSuchElementException e) {
        	// retorna um estado de not found
            return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Create operation
    
    @PostMapping("/clientes")
    public void add(@RequestBody Cliente cliente) {
    	System.out.println("Método POST em /clientes");
        service.save(cliente);
    }
    
    // RESTful API method for Update operation
    
    @PutMapping("/clientes/{cpf}")
    public ResponseEntity<?> update(@RequestBody Cliente cliente, @PathVariable String cpf) {
        try {
            System.out.println("Método PUT/update em /medidores/"+cpf);
            cliente.setCpf(service.get(cpf).getCpf()); // Seta o cpf do medidor que será atualizado como o que está sendo recebido na URL
            service.save(cliente);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
     
    // RESTful API method for Delete operation
    
    @DeleteMapping("/clientes/{cpf}")
    public void delete(@PathVariable String cpf) {
    	System.out.println("Metodo DELETE /clientes/"+cpf);
        service.delete(cpf);
    }
}