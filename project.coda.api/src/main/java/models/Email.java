package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@EntityScan(basePackages = {"br.com.springboot.model"})
public class Email {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String Email;
	private Long ContatoId;
	private boolean Preferencial = false;
}
