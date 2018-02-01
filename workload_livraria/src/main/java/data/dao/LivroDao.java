package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data.dao.conection.FabricaConexao;
import data.model.Livro;

public class LivroDao implements Dao {

	@Override
	public List<Livro> listeLivro() {
		List<Livro> livros = new ArrayList<>();
		
		Connection connection = FabricaConexao.getConnection();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement ("select * from estoque"); 
			ResultSet resultSet = prepareStatement.executeQuery();
			
			while(resultSet.next()) {
				Livro livro = new Livro ();
//				id SERIAL NOT NULL,
//				COD_LIVRO varchar(50),
//				TITULO VARCHAR(30) NOT NULL,
//				AUTOR VARCHAR(20) NOT NULL,
//				PRECO NUMERIC NOT NULL,
//				IMAGEM VARCHAR(80) NOT NULL,
//				DESCRICAO VARCHAR(80),
				
				livro.setId(resultSet.getLong("id"));
				livro.setAutor(resultSet.getString("AUTOR"));
				livro.setTitulo(resultSet.getString("TITULO"));
				livro.setCodLivro(resultSet.getString("COD_LIVRO"));
				livro.setDescricao(resultSet.getString("DESCRICAO"));
				livro.setImagem(resultSet.getString("IMAGEM"));
				livro.setPreco(resultSet.getDouble("PRECO"));	
				
				livros.add(livro);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return livros;
	}

}
