package br.com.churrasquinho_do_gaucho.terminalvendas;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  @Data @NoArgsConstructor
public class Produto {
	
	@Id
	private int codigo;
	private String nome;
	private String descicao;
	private double valor;
	private int estoque;
	

}
