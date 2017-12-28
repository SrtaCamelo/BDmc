package br.ufrpe.beans;

public class ContaBancaria {
	private String cpf;
	private String cnpj;
	private String nome;
	private String numero_conta;
	private String agencia;
	private Banco banco;
	
	/**
	 * Construtor para conta pertecente a uma Instituição.
	 * 
	 * @param cnpj
	 * @param nome
	 * @param numero_conta
	 * @param agencia
	 * @param banco
	 */
	public ContaBancaria(String cnpj, String nome, String numero_conta, String agencia, Banco banco) {
		this.cnpj = cnpj;
		this.cpf = "";
		this.nome = nome;
		this.numero_conta = numero_conta;
		this.agencia = agencia;
		this.banco = banco;
	}
	
	/**
	 * Construtor para conta pertecente a uma Pessoa_Fisica
	 * 
	 * @param cpf
	 * @param nome
	 * @param numero_conta
	 * @param agencia
	 * @param banco
	 */
	public ContaBancaria(String cpf, String nome, String numero_conta, String agencia, Banco banco) {
		this.cpf = cpf;
		this.cnpj = "";
		this.nome = nome;
		this.numero_conta = numero_conta;
		this.agencia = agencia;
		this.banco = banco;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getNumero_conta() {
		return numero_conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public Banco getBanco() {
		return banco;
	}

}
