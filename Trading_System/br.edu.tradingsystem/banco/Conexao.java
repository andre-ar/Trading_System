package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.Cliente;

public class Conexao {
	Connection com;
	
public Connection getConnection(){
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		com = DriverManager.getConnection("jdbc:mysql://localhost:3306/trading", "root", "root");
		System.out.println("conexao aceita");
		return com;
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("erro de conexao");
	return null;	
}

public void fechar_conexao(){
	
	try {
		com.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("conexao finalizada");
}

}