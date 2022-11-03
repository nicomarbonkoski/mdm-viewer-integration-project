package com.catolicasc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.catolicasc.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {	

      /**
       * Encontra todos os clientes inadimplentes.
       *
      List<Cliente> findByInadimplente(Boolean inadimplente);

      /**
       * Encontra um cliente a partir do seu tipo.
       * Retorna uma lista pois podem existir
       * mais de um cliente com mesmo tipo.
       *
      List<Cliente> findByTipoConsumidor(String tipoConsumidor);

      /**
       * Encontra um cliente a partir de seu cpf, como o
       * cpf é único, apenas um cliente pode ser encontrado.
       *
      */
	
      Cliente findByCpf(String cpf);

}