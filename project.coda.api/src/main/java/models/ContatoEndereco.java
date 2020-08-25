package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContatoEndereco {

	
	private Long ContatoId;
	private Contato Contato;
	
	private Endereco Endereco;
	private Long EnderecoId;
}
