package br.ufrpe.domain;
import java.time.LocalDateTime;

public class Cartao {
	private String numero;
	private String Bandeira;
	private String nomeCartao;
	private String codigo;
	private LocalDateTime validade;
	
	
	public Cartao(String numero, String bandeira, String nomeCartao, String codigo, LocalDateTime validade) {
		this.numero = numero;
		Bandeira = bandeira;
		this.nomeCartao = nomeCartao;
		this.codigo = codigo;
		this.validade = validade;
	}


	public String getNumero() {
		return numero;
	}


	public String getBandeira() {
		return Bandeira;
	}


	public String getNomeCartao() {
		return nomeCartao;
	}


	public String getCodigo() {
		return codigo;
	}


	public LocalDateTime getValidade() {
		return validade;
	}
	
}
