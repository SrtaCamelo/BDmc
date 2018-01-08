package br.ufrpe.andamento;

import java.time.LocalDateTime;
import java.util.ArrayList;

import br.ufrpe.minhacapanha.domain.Endereco;
import br.ufrpe.minhacapanha.domain.Funcionario;
import br.ufrpe.minhacapanha.domain.Usuario;

public class Instituicao{
	private String cnpj, nome_fantasia;
	private String razao_social, ramo_atuacao, nome_contato;
	private short telefone1, telefone2;
	private ArrayList<LocalDateTime> data_doacoes_realizadas = new ArrayList<>();
	private ArrayList<LocalDateTime> data_doacoes_efetuadas = new ArrayList<>();
	private ArrayList<Projeto_Social> projetos_lancados = new ArrayList<>();
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private ArrayList<Campanha> campanhas = new ArrayList<>();
	//TODO classe incompleta.
	
}
