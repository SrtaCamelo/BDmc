package br.ufrpe.minhacapanha.domain;
import java.time.LocalDateTime;

public class Doacao extends GenericDomain {
	private LocalDateTime dataDoacao;
	private int qtd_donativo_doado;
	private float qtd_valor_doado;
	
	public Doacao(LocalDateTime dataDoacao, int qtd_donativo_doado) {
		this.dataDoacao = dataDoacao;
		this.qtd_donativo_doado = qtd_donativo_doado;
	}

	public Doacao(LocalDateTime dataDoacao, float qtd_valor_doado) {
		this.dataDoacao = dataDoacao;
		this.qtd_valor_doado = qtd_valor_doado;
	}

	public LocalDateTime getDataDoacao() {
		return dataDoacao;
	}

	public int getQtd_donativo_doado() {
		return qtd_donativo_doado;
	}

	public float getQtd_valor_doado() {
		return qtd_valor_doado;
	}

	public void setQtd_donativo_doado(int qtd_donativo_doado) {
		this.qtd_donativo_doado = qtd_donativo_doado;
	}

	public void setQtd_valor_doado(float qtd_valor_doado) {
		this.qtd_valor_doado = qtd_valor_doado;
	}	
}
