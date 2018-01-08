package br.ufrpe.minhacapanha.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import br.ufrpe.andamento.Disponibilidade;
import br.ufrpe.andamento.Pessoa_Fisica;

public class Voluntario extends GenericDomain {
	private Pessoa_Fisica pessoa;
	private LocalDateTime inicio_voluntariado, fim_voluntariado;
	private boolean possui_carro;
	private Carro carro;
	private ArrayList<Disponibilidade> disponivel_em = new ArrayList<>();

	public Voluntario(Pessoa_Fisica pessoa, Carro carro, ArrayList<Disponibilidade> disponivel_em) {
		this.pessoa = pessoa;
		this.carro = carro;
		this.disponivel_em = disponivel_em;
		this.inicio_voluntariado = LocalDateTime.now();
	}

	public Voluntario(Pessoa_Fisica pessoa, ArrayList<Disponibilidade> disponivel_em) {
		this.pessoa = pessoa;
		this.disponivel_em = disponivel_em;
		this.inicio_voluntariado = LocalDateTime.now();
	}

	public Pessoa_Fisica getPessoa(){
		return pessoa;
	}
	
	public LocalDateTime getInicio_voluntariado() {
		return inicio_voluntariado;
	}

	public LocalDateTime getFim_voluntariado() {
		return fim_voluntariado;
	}

	public boolean isPossui_carro() {
		return possui_carro;
	}

	public Carro getCarro() {
		return carro;
	}

	public ArrayList<Disponibilidade> getDisponivel_em() {
		return disponivel_em;
	}

	public void setFim_voluntariado(LocalDateTime fim_voluntariado) {
		this.fim_voluntariado = fim_voluntariado;
	}

	public void setPossui_carro(boolean possui_carro) {
		this.possui_carro = possui_carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public void setDisponivel_em(ArrayList<Disponibilidade> disponivel_em) {
		this.disponivel_em = disponivel_em;
	}
}