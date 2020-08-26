package com.project.coda.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String logradouro;
	private String bairro;
	private Long numero;
	private EnumUF uf;
	private String municipio;
	private int cep;
	// TRUE => PREFERENCIAL,  FALSE => NÃO PREFERENCIAL
	private boolean preferencial = false;
}
