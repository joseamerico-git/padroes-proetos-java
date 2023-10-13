package com.doichejunior.padroesprojetospring.repository;

import org.springframework.data.repository.CrudRepository;

import com.doichejunior.padroesprojetospring.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
	
}
