package br.ufrpe.beans;
import java.time.LocalDate;

public abstract class Pessoa_Fisica {
	private String primeiro_nome, medio_nome, ultimo_nome;
	private String cpf;
	private LocalDate nascimento;
	private boolean ativo;
	private Endereco end;
	
	public Pessoa_Fisica(){
		primeiro_nome = medio_nome = ultimo_nome = cpf ="";
		nascimento = null;
		ativo = false;
	}
	
	public Pessoa_Fisica(String primeiro_nome, String medio_nome, String ultimo_nome, String cpf, LocalDate nascimento,
			boolean ativo, Endereco end) {
		this.primeiro_nome = primeiro_nome;
		this.medio_nome = medio_nome;
		this.ultimo_nome = ultimo_nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.ativo = ativo;
		this.end = end;
	}

	public String getPrimeiro_nome() {
		return primeiro_nome;
	}

	public String getMedio_nome() {
		return medio_nome;
	}

	public String getUltimo_nome() {
		return ultimo_nome;
	}

	public String getCpf() {
		return cpf;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}
	
	

}
