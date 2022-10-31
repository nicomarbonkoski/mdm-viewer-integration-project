package com.catolicasc.service;
 
import java.util.List;
 
import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catolicasc.entities.Cliente;
import com.catolicasc.repositories.ClienteRepository;
 
@Service
@Transactional
public class ClienteService {
 
	@Autowired
    private ClienteRepository repo;
     
    public List<Cliente> listAll() {
        return repo.findAll();
    }
     
    public void save(Cliente cliente) {
        repo.save(cliente);
    }
     
    public Cliente get(String cpf) {
        return repo.findByCpf(cpf);
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}