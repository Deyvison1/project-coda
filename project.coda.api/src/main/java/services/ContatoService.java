package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Contato;
import repository.IContatoRepository;

@Service
public class ContatoService {

	private final IContatoRepository contatoRepository;
	
	@Autowired
	public ContatoService(IContatoRepository repoContato) {
		this.contatoRepository = repoContato;
	}
	
	public Contato salvar(Contato contato) {
		return contatoRepository.save(contato);
	}
	
	
}
