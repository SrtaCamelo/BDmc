package br.ufrpe.andamento;

import br.ufrpe.domain.Banco;

public class ContaBancaria {
	private String cpf_cnpj;
	private String cnpj;
	private String nome;
	private String numero_conta;
	private String agencia;
	private Banco banco;
	
	public ContaBancaria(String cnpj_cpf, String nome, String numero_conta, String agencia, Banco banco) {
		this.cpf_cnpj = cnpj_cpf;
		this.numero_conta = numero_conta;
		this.agencia = agencia;
		this.banco = banco;
	}
	
	public String getCpf_Cnpj() {
		return cpf_cnpj;
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
