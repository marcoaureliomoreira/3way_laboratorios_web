package dao;

import java.sql.*;
import java.util.logging.Logger;

public class LivroDao {
	Logger LOG = Logger.getGlobal();
	
	private static final String OBTER_POR_ID_SQL = "SELECT AUTOR, TITULO, COD_LIVRO, IMAGEM,"
			+ "PRECO, DESCRICAO FROM ESTOQUE WHERE COD_LIVRO = ?";
	
	private static final String CONSULTAR_SQL = "SELECT"

}
