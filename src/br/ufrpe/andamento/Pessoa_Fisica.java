package br.ufrpe.andamento;
import java.time.LocalDate;
import java.util.ArrayList;

import br.ufrpe.domain.Endereco;
import br.ufrpe.domain.Login;
import br.ufrpe.domain.Usuario;

public class Pessoa_Fisica extends Usuario{
	private String primeiro_nome, medio_nome, ultimo_nome;
	private String cpf;
	private LocalDate nascimento;
	private boolean ativo = true;
	//TODO precisa fazer uma classe de qualificação, mas não entendi direito.
	
	public Pessoa_Fisica(String email, Login login, ArrayList<Endereco> end,
			String primeiro_nome, String medio_nome, String ultimo_nome, String cpf, LocalDate nascimento) {
		super(email, login, end);
		this.primeiro_nome = primeiro_nome;
		this.medio_nome = medio_nome;
		this.ultimo_nome = ultimo_nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
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

	public void setPrimeiro_nome(String primeiro_nome) {
		this.primeiro_nome = primeiro_nome;
	}

	public void setMedio_nome(String medio_nome) {
		this.medio_nome = medio_nome;
	}

	public void setUltimo_nome(String ultimo_nome) {
		this.ultimo_nome = ultimo_nome;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
