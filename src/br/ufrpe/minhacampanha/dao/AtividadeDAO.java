package br.ufrpe.minhacampanha.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.ufrpe.minhacampanha.util.ConnectionFactory;
import br.ufrpe.minhacapanha.domain.Atividade;

public class AtividadeDAO {

	public void criar(Atividade atividade) throws SQLException{
		Connection connection = ConnectionFactory.getConnection();
		java.sql.PreparedStatement stmt = null;
		try{
			stmt = connection.prepareStatement("INSERT INTO atividade (id, id_campanha, descricao, tipo,duracao_media)VALUES(?,?,?,?)");
			stmt.setLong(1, atividade.getCodigo());
			stmt.setLong(2, atividade.getCodigoCampanha());
			stmt.setString(3, atividade.getTipo());
			stmt.setString(4, atividade.getDescricao());
			stmt.setString(5, atividade.getDuracaoMedia());
			
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso");
			
		}catch (SQLException ex){
			//JOptionPane.showMessageDialog(null, "Erro ao salvar - "+ex);
			
		}finally{
			ConnectionFactory.closeConnection(connection, stmt);
		}
	}
	
	public List<Atividade> listar() throws SQLException{

		Connection connection = ConnectionFactory.getConnection();
		java.sql.PreparedStatement stmt = null;
		ResultSet resultSet = null;
		
		List<Atividade> atividades = new ArrayList<Atividade>();
		
		try{
		
			stmt = connection.prepareStatement("SELECT * FROM atividade");
			resultSet =stmt.executeQuery();
		
			while (resultSet.next()){
				
				Atividade atividade = new Atividade();
				
				atividades.add(atividade);
			 }
			
		}catch (SQLException ex){
			//JOptionPane.showMessageDialog(null, "Erro ao listar - "+ex);
		}finally{
			ConnectionFactory.closeConnection(connection, stmt, resultSet);
		}
		
		return atividades;
		
	}
	
	public void update(Atividade atividade) throws SQLException{
		Connection connection = ConnectionFactory.getConnection();
		java.sql.PreparedStatement stmt = null;
		
		try{
			stmt = connection.prepareStatement("UPDATE atividade SET descricao =  ?, tipo = ?, duracao_media = ? WHERE id = ?");
			
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso");
			
		}catch (SQLException ex){
			//JOptionPane.showMessageDialog(null, "Erro ao atualizar - "+ex);
			
		}finally{
			ConnectionFactory.closeConnection(connection, stmt);
		}
	}
	
	public void excluir(Atividade atividade) throws SQLException{
		Connection connection = ConnectionFactory.getConnection();
		java.sql.PreparedStatement stmt = null;
		
		try{
			stmt = connection.prepareStatement("DELETE FROM atividade WHERE cpf = ?");
			stmt.setLong(1, atividade.getCodigo());
						
			stmt.executeUpdate();
			
			//JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
			
		}catch (SQLException ex){
			//JOptionPane.showMessageDialog(null, "Erro ao excluir - "+ex);
			
		}finally{
			ConnectionFactory.closeConnection(connection, stmt);
		}
		
		
	}
}
