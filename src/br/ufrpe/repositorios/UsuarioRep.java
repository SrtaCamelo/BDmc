package br.ufrpe.repositorios;

import java.util.ArrayList;

import br.ufrpe.minhacapanha.domain.Usuario;

public class UsuarioRep {
	
	private ArrayList<Usuario> usuarioRep;
	
	public UsuarioRep() {}
	
	public void add(Usuario novo) {
		this.usuarioRep.add(novo);
	}
	
	public void remove(Usuario remover) {
		this.usuarioRep.remove(remover);
	}
	
	public Usuario buscar(String login) {
		for(Usuario busca: this.usuarioRep) {
			if(busca.getLogin().getLogin().equals(login)) {
				return busca;
			}
		}
	}
	
	public void atualizar(Usuario novo) {
		String login = novo.getLogin().getLogin();
		Usuario antigo = this.buscar(login);
		this.usuarioRep.remove(antigo);
		this.usuarioRep.add(novo);
	}
	
	public void update(Usuario novo, Usuario antigo) {
		this.usuarioRep.remove(antigo);
		this.usuarioRep.add(novo);
	}

}
