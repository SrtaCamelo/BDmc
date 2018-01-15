package br.ufrpe.repositorios;

import br.ufrpe.minhacapanha.domain.*;
import java.util.ArrayList;

public class ProjetoSocialRep {
	private ArrayList<ProjetoSocial> projetoSocialRep;
	
	public ProjetoSocialRep() {}
	
	public void add(ProjetoSocial novo) {
		this.projetoSocialRep.add(novo);
	}
	
	public void remove(ProjetoSocial antigo) {
		this.projetoSocialRep.remove(antigo);
	}
	
	public ProjetoSocial busca(String nome) {
		for(ProjetoSocial busca: this.projetoSocialRep) {
			if(busca.getNome().equals(nome)) {
				return busca;
			}
		}
	}
	
	

}
