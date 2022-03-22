package com.Projeto.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Projeto.Api.entities.Projeto;

@Repository

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

	
}
