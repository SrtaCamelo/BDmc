package br.ufrpe.beans;

import java.time.LocalDateTime;

public class Voluntario extends Pessoa_Fisica{
	private Pessoa_Fisica pessoa;
	private LocalDateTime inicio_voluntariado, fim_voluntariado;
	private boolean possui_carro;
	private Carro carro;
	private LocalDateTime hora_disponivel_inicio, hora_disponivel_fim;
	
	
	public Voluntario(Pessoa_Fisica pessoa, LocalDateTime inicio_voluntariado, Carro carro) {
		this.pessoa = pessoa;
		this.inicio_voluntariado = inicio_voluntariado;
		this.carro = carro;
		possui_carro = true;
	}


	public Voluntario(Pessoa_Fisica pessoa, LocalDateTime inicio_voluntariado) {
		this.pessoa = pessoa;
		this.inicio_voluntariado = inicio_voluntariado;
		possui_carro = false;
	}


	public LocalDateTime getFim_voluntariado() {
		return fim_voluntariado;
	}


	public Carro getCarro() {
		return carro;
	}


	public LocalDateTime getHora_disponivel_inicio() {
		return hora_disponivel_inicio;
	}


	public LocalDateTime getHora_disponivel_fim() {
		return hora_disponivel_fim;
	}


	public void setFim_voluntariado(LocalDateTime fim_voluntariado) {
		this.fim_voluntariado = fim_voluntariado;
	}


	public void setCarro(Carro carro) {
		this.carro = carro;
	}


	public void setHora_disponivel_inicio(LocalDateTime hora_disponivel_inicio) {
		this.hora_disponivel_inicio = hora_disponivel_inicio;
	}


	public void setHora_disponivel_fim(LocalDateTime hora_disponivel_fim) {
		this.hora_disponivel_fim = hora_disponivel_fim;
	}
}
