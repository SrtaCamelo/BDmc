package br.ufrpe.andamento;

import java.time.LocalDateTime;
import java.util.ArrayList;

import br.ufrpe.domain.Avaliacao;
import br.ufrpe.domain.Avaliacoes;
import br.ufrpe.domain.Meta;
import br.ufrpe.domain.Ponto_Coleta;
import br.ufrpe.domain.Situacao;

public class Campanha {
	private static int id = 0;
	private LocalDateTime data_incio, data_fim;
	private ArrayList<Avaliacoes> avaliacoes_efetuadas = new ArrayList<>();
	private ArrayList<Meta> metas = new ArrayList<>();
	private ArrayList<Ponto_Coleta> pontos_coleta = new ArrayList<>();
	private String publico_alvo, nome;
	private Situacao status;
	/*
	 * TODO quantidade_volume_atual essa variavel ainda esta incerta.
	 */
}
