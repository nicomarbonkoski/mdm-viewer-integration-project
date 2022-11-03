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
    	System.out.println("Metodo get em /clientes");
    	// Retorna uma lista com todos os clientes
        return service.listAll();
    }
    
    @GetMapping("/clientes/{cpf}")
    public ResponseEntity<Cliente> get(@PathVariable String cpf) {
    	System.out.println("Metodo get em /clientes/cpf");
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
    	System.out.println("Método post em /clientes");
        service.save(cliente);
    }
    
    // RESTful API method for Update operation
    
    @PutMapping("/clientes/{cpf}")
    public ResponseEntity<?> update(@RequestBody Cliente cliente, @PathVariable String cpf) {
        try {
        	System.out.println("Método update em /clientes/cpf");
//            Cliente existeCliente = service.get(cpf); // No guia essa linha de código existia, mas ela não afeta em nada o funcionamento
            service.save(cliente);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Delete operation
    
    @DeleteMapping("/clientes/{cpf}")
    public void delete(@PathVariable String cpf) {
    	System.out.println("Metodo delete /clientes/cpf");
        service.delete(cpf);
    }
}