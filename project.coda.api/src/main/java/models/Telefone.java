package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Telefone {

	
	private Long Id;
	private EnumUF UF;
	private int Numero;
	private boolean Preferencial = false;
	private Long ContatoId;
}
