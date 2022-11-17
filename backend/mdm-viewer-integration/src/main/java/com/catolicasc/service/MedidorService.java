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
    
	// Lista todos os medidores
    public List<Medidor> listAll() {
        return repo.findAll();
    }
    
    // Caso exista um medidor relacionado a um cliente, retorna positivo
    public boolean relacionadoComCpf(String cpf){
    	System.out.println("Verificando se cpf "+cpf+" esta relacionado com um medidor.");
    	if (repo.findByCpfTitular(cpf).isEmpty()) {
    		return false;
    	};
    	return true;
    }
    
    // salva ou atualiza um dado no BD
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