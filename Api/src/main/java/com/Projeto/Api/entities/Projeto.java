package com.Projeto.Api.entities;

import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Projeto {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double preco; 
	private String foto;
	
	public Projeto() {
		
		
	}
	
	
	
	public Projeto(long id, String nome, Double preco, String foto) {
		
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.foto = foto;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}



	public String getFoto() {
		return foto;
	}



	public void setFoto(String foto) {
		this.foto = foto;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		return id == other.id;
	}
	
	

}
