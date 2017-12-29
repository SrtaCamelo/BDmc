package br.ufrpe.andamento;
import java.time.LocalDateTime;

import br.ufrpe.domain.Cartao;

public class Doador_PF {
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
