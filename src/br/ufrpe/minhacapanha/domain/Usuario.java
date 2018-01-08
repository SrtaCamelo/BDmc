package br.ufrpe.minhacapanha.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Usuario extends GenericDomain {
	private static int id = 0;
	private String email;
	private Login login;
	private LocalDateTime data_criação;
	private ArrayList<Endereco> enderecos = new ArrayList<>();
	private ArrayList<Avaliacoes> avaliacoes_efetuadas = new ArrayList<>();
	
	public Usuario(){
		
	}

	public Usuario(String email, Login login, ArrayList<Endereco> enderecos) {
		this.email = email;
		this.login = login;
		this.enderecos = enderecos;
		this.data_criação = LocalDateTime.now();
	}

	public static int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public Login getLogin() {
		return login;
	}

	public LocalDateTime getData_criação() {
		return data_criação;
	}

	public ArrayList<Avaliacoes> getAvaliacoes_efetuadas() {
		return avaliacoes_efetuadas;
	}

	public void setAvaliacoes_efetuadas(ArrayList<Avaliacoes> avaliacoes_efetuadas) {
		this.avaliacoes_efetuadas = avaliacoes_efetuadas;
	}	
}
