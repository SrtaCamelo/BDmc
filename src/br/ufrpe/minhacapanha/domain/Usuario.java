package br.ufrpe.minhacapanha.domain;

import java.time.LocalDateTime;

public abstract class Usuario extends GenericDomain {
	private static int id = 0;
	private String email;
	private Login login;
	private LocalDateTime data_criação;
	
	public Usuario(){
		
	}

	public Usuario(String email, Login login) {
		this.email = email;
		this.login = login;
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
}
