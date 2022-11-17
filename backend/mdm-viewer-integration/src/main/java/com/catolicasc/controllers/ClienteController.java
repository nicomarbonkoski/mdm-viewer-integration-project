package com.catolicasc.controllers;
 
import java.util.*;
 
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.catolicasc.entities.Cliente;
import com.catolicasc.service.ClienteService;
import com.catolicasc.service.MedidorService;
 
@CrossOrigin(origins = "http://localhost:4200/",maxAge=3600)
@RequestMapping({"/"})

@RestController
public class ClienteController {
 
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private MedidorService medidorService;
     
    // RESTful API methods for Retrieval operations
    
    @GetMapping("/clientes")
    public List<Cliente> list() {
    	System.out.println("Metodo GET em /clientes");
    	// Retorna uma lista com todos os clientes
        return clienteService.listAll();
    }
    
    @GetMapping("/clientes/{cpf}")
    public ResponseEntity<Cliente> get(@PathVariable String cpf) {
    	System.out.println("Metodo GET em /clientes/"+cpf);
        try {
            Cliente cliente = clienteService.get(cpf);
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
        clienteService.save(cliente);
    }
    
    // RESTful API method for Update operation
    
    @PutMapping("/clientes/{cpf}")
    public ResponseEntity<?> update(@RequestBody Cliente cliente, @PathVariable String cpf) {
        try {
            System.out.println("Método PUT/update em /clientes/"+cpf);
            cliente.setCpf(clienteService.get(cpf).getCpf()); // Seta o cpf do medidor que será atualizado como o que está sendo recebido na URL
            clienteService.save(cliente);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
     
    // RESTful API method for Delete operation
    
	  @DeleteMapping("/clientes/{cpf}")
	  public void delete(@PathVariable String cpf) {
	  	System.out.println("Metodo DELETE /clientes/"+cpf);
	  	if (medidorService.relacionadoComCpf(cpf)) {
	  		System.out.println("Não é possível deletar o cliente "+cpf+", este está relacionado com um medidor.");
	  	}
	  	else {
	  		clienteService.delete(cpf);
	  		System.out.println("Cliente CPF: "+cpf+" deletado com sucesso.");
	  	}
	  }
}