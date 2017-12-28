package br.ufrpe.beans;
import java.time.LocalDate;
import java.util.ArrayList;

import br.ufrpe.beans.finalizadas.Avaliacao;
import br.ufrpe.beans.finalizadas.Endereco;
import br.ufrpe.beans.finalizadas.Login;
import br.ufrpe.beans.finalizadas.Usuario;

public class Pessoa_Fisica extends Usuario{
	private String primeiro_nome, medio_nome, ultimo_nome;
	private String cpf;
	private LocalDate nascimento;
	private boolean ativo = true;
	private Endereco end;
	private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
	//TODO precisa fazer uma classe de qualificação, mas não entendi direito.
	//TODO muitas coisas ainda para por nessa classe.
	
	public Pessoa_Fisica(String email, Login login,
			String primeiro_nome, String medio_nome, String ultimo_nome, String cpf, LocalDate nascimento,
			Endereco end) {
		super(email, login);
		this.primeiro_nome = primeiro_nome;
		this.medio_nome = medio_nome;
		this.ultimo_nome = ultimo_nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
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

	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
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

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	
	
}
