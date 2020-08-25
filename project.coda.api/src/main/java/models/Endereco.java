package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Endereco {

	
	private String Logradouro;
	private String Bairro;
	private Long Numero;
	private EnumUF UF;
	private String Municipio;
	private int CEP;
	// TRUE => PREFERENCIAL,  FALSE => NÃO PREFERENCIAL
	private boolean Preferencial = false;
}
