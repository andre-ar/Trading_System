package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Conexao {
	
	Connection conn;
	private static Conexao conexao;
	private static ResourceBundle config;
	
	private Conexao() {
		config = ResourceBundle.getBundle("config");
	}
	
	public static Conexao getInstance(){
		if (conexao == null){
			conexao =  new Conexao();
		}
		return conexao;
	}
	
	public Connection getConnection(){
		
		
		try {
			Class.forName(config.getString("driver"));
			conn = DriverManager.getConnection(config.getString("url"), config.getString("user"), config.getString("password"));
			System.out.println("conexao aceita");
			return conn;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("erro de conexao");
		return null;	
	}

	public void fechar_conexao(){
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("conexao finalizada");
	}


}