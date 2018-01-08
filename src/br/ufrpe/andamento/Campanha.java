package br.ufrpe.andamento;

import java.time.LocalDateTime;
import java.util.ArrayList;

import br.ufrpe.minhacampanha.enumeracao.Avaliacao;
import br.ufrpe.minhacampanha.enumeracao.Situacao;
import br.ufrpe.minhacapanha.domain.Avaliacoes;
import br.ufrpe.minhacapanha.domain.Meta;
import br.ufrpe.minhacapanha.domain.Ponto_Coleta;

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
