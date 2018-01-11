package br.ufrpe.minhacapanha.domain;

import java.time.LocalDateTime;

public class Atividade extends GenericDomain {
	private String descricao, tipo;
	private LocalDateTime duracao;
	public String getDescricao() {
		return descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public LocalDateTime getDuracao() {
		return duracao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setDuracao(LocalDateTime duracao) {
		this.duracao = duracao;
	}
	
	
}
