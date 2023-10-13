package com.doichejunior.padroesprojetospring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doichejunior.padroesprojetospring.model.Endereco;

@Repository // Como extendemos a Strategy CrudRepository a anotação é opcional
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
