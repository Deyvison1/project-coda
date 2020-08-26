package com.project.coda.models;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	@OneToMany
	private List<Endereco> enderecos;
	@OneToMany
	private List<Telefone> telefones;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Email> emails;
	
	public Contato() {
		this.emails = new ArrayList<>();
		this.telefones = new ArrayList<>();
		this.enderecos = new ArrayList<>();
	}
	
}
