package com.catolicasc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catolicasc.entities.Medidor;

public interface MedidorRepository extends JpaRepository<Medidor, Integer>{
	
	Medidor findById (int id);
	
}
