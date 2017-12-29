package br.ufrpe.domain;

public class Banco {
	private short codigo;
	private String nome;
	private String cnpj;
	private String razao_social;
	
	public Banco(short codigo, String nome, String cnpj, String razao_social) {
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.razao_social = razao_social;
	}

	public short getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazao_social() {
		return razao_social;
	}	
}
