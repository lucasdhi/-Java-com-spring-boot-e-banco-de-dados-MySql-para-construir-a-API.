package com.Projeto.Api.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Projeto.Api.entities.Projeto;
import com.Projeto.Api.repositories.ProjetoRepository;



@Service
public class ProjetoService {
	
	@Autowired
	private ProjetoRepository repository;
	
    @Transactional(readOnly = true)
	public List<Projeto> findAll(){
		
		List<Projeto> resultado = repository.findAll();
		return resultado;
		
		
	}

}
