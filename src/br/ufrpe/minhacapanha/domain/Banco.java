package br.ufrpe.minhacapanha.domain;

public class Banco extends GenericDomain {
	private String nome;
	private String cnpj;
	private String razao_social;
	
	public Banco(String nome, String cnpj, String razao_social) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.razao_social = razao_social;
	}

	public Banco(){
		
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
