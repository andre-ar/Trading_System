package br.edu.trading.banco;

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

public void inserir_cliente(Cliente cliente) throws SQLException{
	
	String sql = "insert into tb_cliente" + "(nome, endereço, telefone, email, cpf)" + "values" + "(?,?,?,?,?)";
	PreparedStatement statement = com.prepareStatement(sql);
	statement.setString(1, cliente.getNome());
	statement.setString(2, cliente.getEndereco());
	statement.setInt(3, cliente.getTelefone());
	statement.setString(4, cliente.getEmail());
	statement.setInt(5, cliente.getCpf());
	statement.execute();
	System.out.println("inserido cliente: " + cliente.getNome());
	}

public void alterar_cliente(){}




}