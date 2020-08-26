package com.project.coda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.coda.models.Contato;
import com.project.coda.models.Email;
import com.project.coda.repository.EmailRepository;
import com.project.coda.repository.IContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private IContatoRepository repoContato;
	
	@Autowired
	private EmailRepository emailRepository;
	
	
	public List<Contato> FindAll() {
		return repoContato.findAll();
	}
	
	public Contato FindById(Long id) 
	{
		return repoContato.findContatoById(id);
	}
	
	public Contato salvar(Contato contato) {
		return repoContato.save(contato);
	}
	
}
