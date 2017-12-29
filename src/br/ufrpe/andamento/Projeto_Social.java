package br.ufrpe.andamento;

import java.time.LocalDateTime;
import java.util.ArrayList;

import br.ufrpe.domain.Voluntario;

public class Projeto_Social {
	private String tipo, nome, descricao, objetivo;
	private static int id = 0;
	private LocalDateTime data_inicio, data_fim;
	private Instituicao instituicao_responsavel;
	private ArrayList<Voluntario> voluntarios = new ArrayList<>();
		
}
