package br.ufrpe.beans.finalizadas;

public enum Situacao {
	CRITICA(1), POUCOCRITICA(2), MEDIANA(3), SATISFATORIO(4), ALCANCADA(5);
	
	private final int valor;
	
	Situacao(int valorOpcao){
		valor = valorOpcao;
	}
	
	public int getValor(){
		return valor;
	}
}
