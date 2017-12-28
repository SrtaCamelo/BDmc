package br.ufrpe.beans;
import java.time.LocalDateTime;

import br.ufrpe.beans.finalizadas.Cartao;;

/**
 * Como vai ser essa classe?
 * 
 * ACHO QUE PODERIA TER ATRIBUTOS DIFERENTES NA PROPRIA CLASSE DE PESSOA_FISICA!!
 * 
 * @author fer
 *
 */

public class Doador_PF{
	private Cartao cartao;
	private ContaBancaria conta;
	private LocalDateTime UltimaDoacao;	
	private Pessoa_Fisica pessoa;
	
	public Doador_PF(Cartao cartao, ContaBancaria conta, LocalDateTime ultimaDoacao, Pessoa_Fisica pessoa) {
		this.cartao = cartao;
		this.conta = conta;
		UltimaDoacao = ultimaDoacao;
		this.pessoa = pessoa;
	}

	private void doarItem() {

	}

	private void doarDinheiro(double valor) {

	}
}
