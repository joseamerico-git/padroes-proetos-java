package com.doichejunior.padroesprojetospring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doichejunior.padroesprojetospring.model.Endereco;

@FeignClient(name="viacep", url="https://viacep.com.br/ws")
public interface ViaCepService {
	
	@RequestMapping(method = RequestMethod.GET, value ="/{cep}/json")
	//ou @GetMapping("/{cep}/json")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
