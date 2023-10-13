package com.doichejunior.padroesprojetospring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.doichejunior.padroesprojetospring.model.Cliente;
import com.doichejunior.padroesprojetospring.model.Endereco;
import com.doichejunior.padroesprojetospring.repository.ClienteRepository;
import com.doichejunior.padroesprojetospring.repository.EnderecoRepository;
import com.doichejunior.padroesprojetospring.service.ClienteService;
import com.doichejunior.padroesprojetospring.service.ViaCepService;

public class ClienteServiceImpl implements ClienteService {

	// Singleton: injetar os componentes do Spring com @AutoWired;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;

	@Override
	public Iterable<Cliente> buscarTodos() {

		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// TODO Auto-generated method stub
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);

	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if (clienteBd.isPresent()) {
			salvarClienteComCep(cliente);
		}

	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);

	}

	private void salvarClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();

		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			// Caso o endereço não exista
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});

		cliente.setEndereco(endereco);

		clienteRepository.save(cliente);
	}

}
