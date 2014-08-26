package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Conexao {
	Connection conn;
	private static ResourceBundle config;
	
	public Connection getConnection(){
		
		try {
			Class.forName("conn.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trading", "root", "root");
			System.out.println("conexao aceita");
			return conn;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("erro de conexao");
		return null;	
	}

	public void fechar_conexao(){
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("conexao finalizada");
	}


}