package br.ufrpe.beans.finalizadas;

import java.time.LocalDateTime;
import java.util.ArrayList;

import br.ufrpe.beans.Disponibilidade;

public class Ponto_Coleta {
	private static int codigo = 0;
	private String descricao;
	private String observacao;
	private LocalDateTime data_inicio, data_fim;
	private Endereco endereco;
	private ArrayList<Disponibilidade> responsaveis = new ArrayList<>();
	//TODO classe entrega
	
	public Ponto_Coleta(String descricao, String observacao, LocalDateTime data_inicio, 
			LocalDateTime data_fim, Endereco endereco) {
		this.descricao = descricao;
		this.observacao = observacao;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.endereco = endereco;
		this.codigo += 1;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public LocalDateTime getData_inicio() {
		return data_inicio;
	}

	public LocalDateTime getData_fim() {
		return data_fim;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public ArrayList<Disponibilidade> getResponsaveis() {
		return responsaveis;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void setData_inicio(LocalDateTime data_inicio) {
		this.data_inicio = data_inicio;
	}

	public void setData_fim(LocalDateTime data_fim) {
		this.data_fim = data_fim;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setResponsaveis(ArrayList<Disponibilidade> responsaveis) {
		this.responsaveis = responsaveis;
	}
}
