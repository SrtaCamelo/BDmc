package br.ufrpe.beans;
import java.time.LocalDateTime;

import br.ufrpe.beans.finalizadas.Cartao;

public class Doacao_Financeiro extends Doacao {
	private double valor;
	private int id_doacao;
	private Cartao card;
	private Transferencia transfere;

}
