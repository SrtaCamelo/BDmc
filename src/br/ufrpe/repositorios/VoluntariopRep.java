package br.ufrpe.repositorios;
/*
 * Repositorio Voluntario - Pessoa
 */
import java.util.ArrayList;

import br.ufrpe.minhacapanha.domain.*;

public class VoluntariopRep {
	ArrayList<VoluntarioPessoa> volutariopRep;
	
	
	public VoluntariopRep () {
		
	}
	
	public void add(VoluntarioPessoa nova) {
		this.volutariopRep.add(nova);
	}
	
	public void remove(VoluntarioPessoa remover) {
		this.volutariopRep.remove(remover);
	}
	
	public VoluntarioPessoa buscar(int index) {
		return this.volutariopRep.get(index);
	}
	
	public VoluntarioPessoa buscarCPF(String cpf) {
		boolean found = false;
		for(VoluntarioPessoa busca: this.volutariopRep) {
			if(busca.getCpf().equals(cpf)) {
				return busca;
			}
		}
		
	}
	
	public void update(VoluntarioPessoa nova) {
		String cpf = nova.getCpf();
		VoluntarioPessoa remover = buscarCPF(cpf);
		remove(remover);
		add(nova);
		
	}

}

