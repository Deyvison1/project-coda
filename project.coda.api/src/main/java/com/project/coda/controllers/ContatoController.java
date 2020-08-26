package com.project.coda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.coda.models.Contato;
import com.project.coda.models.Email;
import com.project.coda.models.Endereco;
import com.project.coda.repository.EmailRepository;
import com.project.coda.services.ContatoService;

@RestController
@RequestMapping({"/contato"})
public class ContatoController {

	@Autowired
	private ContatoService serviceContato;
	
	@PostMapping
	public ResponseEntity<Contato> Salvar(@RequestBody Contato contato) {
		return ResponseEntity.ok(serviceContato.salvar(contato));
	}
	
}
