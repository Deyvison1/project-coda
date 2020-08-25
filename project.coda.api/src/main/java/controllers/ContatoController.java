package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import models.Contato;
import services.ContatoService;

@RequestMapping("/contato")
@Controller
public class ContatoController {
	
	private final ContatoService contatoService;
	
	@Autowired
	public ContatoController(ContatoService contatoService) {
		this.contatoService = contatoService;
	}
	
	@PostMapping
	public ResponseEntity<Contato> salvar(@RequestBody Contato contato) {
		return new ResponseEntity<>(contato, HttpStatus.CREATED);
	}
	
	@GetMapping(name = "/")
	public String teste() {
		return "Oi";
	}
	
}
