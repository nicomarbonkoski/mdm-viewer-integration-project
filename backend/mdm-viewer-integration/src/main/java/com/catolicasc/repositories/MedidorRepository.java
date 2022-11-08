package com.catolicasc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catolicasc.entities.Medidor;

public interface MedidorRepository extends JpaRepository<Medidor, Integer>{
	
	Medidor findById (int id);
	
	/**
     * Encontra todos os clientes relacionados a determinado titular.
     */
    List<Medidor> findByCpfTitular(String cpfTitular);
	
}
