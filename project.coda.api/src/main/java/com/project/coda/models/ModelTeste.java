package com.project.coda.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "ModelTeste")
public class ModelTeste {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long Id;
	public String Nome;
}
