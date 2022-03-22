package com.Projeto.Api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Projeto.Api.entities.Projeto;
import com.Projeto.Api.servicies.ProjetoService;


@RestController
@RequestMapping(path = "/Projeto")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjetoResource {
	
	
	@Autowired
	private ProjetoService service;
	
	
	@GetMapping
	public List<Projeto> findAll(){
		return service.findAll();
		
		
		
		
			
		
	}

}
