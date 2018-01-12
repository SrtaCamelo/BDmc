package br.ufrpe.minhacapanha.domain;

public class ProdutoREF extends GenericDomain {
	private String descricao;
	private String codigo_barras;
	private String marca;
	
	public ProdutoREF(String descricao, String codigo_barras, String marca) {
		this.descricao = descricao;
		this.codigo_barras = codigo_barras;
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getCodigo_barras() {
		return codigo_barras;
	}

	public String getMarca() {
		return marca;
	}
}
