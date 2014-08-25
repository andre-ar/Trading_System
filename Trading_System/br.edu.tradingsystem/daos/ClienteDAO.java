package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Conexao;
import beans.Cliente;

public class ClienteDAO {

	private Connection connection;
	
	
	public void inserirCliente(Cliente cliente) throws SQLException{
		
		String sql = "insert into tb_cliente" + "(nome, endereco, telefone, email, cpf)" + "values" + "(?,?,?,?,?)";
		connection = new Conexao().getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getEndereco());
		statement.setInt(3, cliente.getTelefone());
		statement.setString(4, cliente.getEmail());
		statement.setInt(5, cliente.getCpf());
		statement.execute();
		System.out.println("inserido cliente: " + cliente.getNome());
		
		}
	
	public void  atualizarCliente(Cliente cliente) throws SQLException{
		String sql = "update tb_cliente" +
					 "set nome=?, "+
					 "endereco =?," +
					 "telefone = ?," +
					 "email=?," +
					 "cpf=?";
		connection = new Conexao().getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getEndereco());
		statement.setInt(3, cliente.getTelefone());
		statement.setString(4, cliente.getEmail());
		statement.setInt(5, cliente.getCpf());
		statement.execute();
		System.out.println("atualizado cliente: " + cliente.getNome());
		
	}
	
	
	
}
