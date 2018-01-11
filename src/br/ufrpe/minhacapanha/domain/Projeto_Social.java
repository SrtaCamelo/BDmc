package br.ufrpe.minhacapanha.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Projeto_Social extends GenericDomain {
	private String tipo, nome, descricao, objetivo;
	private LocalDateTime data_inicio, data_fim;
	
	public Projeto_Social(String tipo, String nome, String descricao, String objetivo, LocalDateTime data_inicio,
			LocalDateTime data_fim) {
		this.tipo = tipo;
		this.nome = nome;
		this.descricao = descricao;
		this.objetivo = objetivo;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
	}

	public String getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public LocalDateTime getData_inicio() {
		return data_inicio;
	}

	public LocalDateTime getData_fim() {
		return data_fim;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public void setData_inicio(LocalDateTime data_inicio) {
		this.data_inicio = data_inicio;
	}

	public void setData_fim(LocalDateTime data_fim) {
		this.data_fim = data_fim;
	}
}
