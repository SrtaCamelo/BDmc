package br.ufrpe.domain;

import java.time.LocalDateTime;

import br.ufrpe.andamento.Campanha;

public class Avaliacoes {
	private Avaliacao nota; 
	private String comentario;
	private LocalDateTime data_avaliacao;
	private Usuario usuario_fez, usuario_recebe;
	private Campanha campanha_recebe, campanha_fez;
	
	public Avaliacoes(Avaliacao nota, String comentario, LocalDateTime data_avaliacao, Usuario usuario_fez,
			Campanha campanha_recebe) {
		this.nota = nota;
		this.comentario = comentario;
		this.data_avaliacao = data_avaliacao;
		this.usuario_fez = usuario_fez;
		this.campanha_recebe = campanha_recebe;
	}

	public Avaliacoes(Avaliacao nota, String comentario, LocalDateTime data_avaliacao,
			Campanha campanha_fez, Usuario usuario_recebe) {
		this.nota = nota;
		this.comentario = comentario;
		this.data_avaliacao = data_avaliacao;
		this.usuario_recebe = usuario_recebe;
		this.campanha_fez = campanha_fez;
	}

	public Avaliacao getNota() {
		return nota;
	}

	public String getComentario() {
		return comentario;
	}

	public LocalDateTime getData_avaliacao() {
		return data_avaliacao;
	}

	public Usuario getUsuario_fez() {
		return usuario_fez;
	}

	public Usuario getUsuario_recebe() {
		return usuario_recebe;
	}

	public Campanha getCampanha_recebe() {
		return campanha_recebe;
	}

	public Campanha getCampanha_fez() {
		return campanha_fez;
	}

	public void setNota(Avaliacao nota) {
		this.nota = nota;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public void setData_avaliacao(LocalDateTime data_avaliacao) {
		this.data_avaliacao = data_avaliacao;
	}
}
