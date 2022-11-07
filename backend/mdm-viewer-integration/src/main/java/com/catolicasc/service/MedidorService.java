package com.catolicasc.service;
 
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catolicasc.entities.Medidor;
import com.catolicasc.repositories.MedidorRepository;
 
@Service
@Transactional
public class MedidorService {
 
	@Autowired
    private MedidorRepository repo;
     
    public List<Medidor> listAll() {
        return repo.findAll();
    }
     
    public void save(Medidor medidor) {
        repo.save(medidor);
    }
     
    public Medidor get(int id) {
        return repo.findById(id);
    }
     
    public void delete(int id) {
        repo.deleteById(id);
    }
}