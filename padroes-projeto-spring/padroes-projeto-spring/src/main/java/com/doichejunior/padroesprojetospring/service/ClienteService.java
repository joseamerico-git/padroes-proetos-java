package com.doichejunior.padroesprojetospring.service;

import com.doichejunior.padroesprojetospring.model.Cliente;

//Strategy
public interface ClienteService {

	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);
	
}
