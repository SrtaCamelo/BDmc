package br.ufrpe.beans.finalizadas;

public class Carro {
	private String marca;
	private String placa;
	private String estado, cidade;
	
	public Carro(String marca, String placa, String estado, String cidade) {
		this.marca = marca;
		this.placa = placa;
		this.estado = estado;
		this.cidade = cidade;
	}

	public String getMarca() {
		return marca;
	}

	public String getPlaca() {
		return placa;
	}

	public String getEstado() {
		return estado;
	}

	public String getCidade() {
		return cidade;
	}
}
