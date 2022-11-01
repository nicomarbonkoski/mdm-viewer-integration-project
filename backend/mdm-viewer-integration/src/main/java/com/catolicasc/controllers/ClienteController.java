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
    	System.out.println(service);
        return service.listAll();
    }
     
    // RESTful API method for Create operation
     
    // RESTful API method for Update operation
     
    // RESTful API method for Delete operation
}