package br.ufrpe.beans;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class DoacaoItem extends Doacao {
	private boolean status;
	private ArrayList<Item> itens_doados;
	private int quantidade;
	private LocalDateTime data_entrada;
	private LocalDateTime validade;
}
