package dao;

import java.sql.*;

public class FabricaConexao {
static final String url = "jdbc:postgresql://localhost:5432/BookStore";
static final String usuario = "postgres";
static final String senha = "postgres";

public static Connection getConexao () throws SQLException {
	try {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(url,usuario,senha);
		
	}catch(ClassNotFoundException e) {
		throw new SQLException(e.getMessage());
		
	}
}
	
}
