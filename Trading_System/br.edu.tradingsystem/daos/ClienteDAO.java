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
		connection = Conexao.getInstance().getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
	
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getEndereco());
		statement.setInt(3, cliente.getTelefone());
		statement.setString(4, cliente.getEmail());
		statement.setLong(5, cliente.getCpf());
		statement.execute();
		connection.close();
		
		System.out.println("inserido cliente: " + cliente.getNome());		}
	
	
	public void  atualizarCliente(Cliente cliente) throws SQLException{
		String sql = "update tb_cliente" +
					 "set nome=?, "+
					 "endereco =?," +
					 "telefone = ?," +
					 "email=?," +
					 " where cpf =? ";
		connection = Conexao.getInstance().getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getEndereco());
		statement.setInt(3, cliente.getTelefone());
		statement.setString(4, cliente.getEmail());
		statement.setLong(5, cliente.getCpf());
		statement.execute();
		connection.close();
		
		System.out.println("atualizado cliente: " + cliente.getNome());
		
	}
	
	public void removerCliente(long cpf) throws SQLException{
		String sql = "delete from tb_cliente where cpf=?";
		
		connection = Conexao.getInstance().getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, cpf);
		statement.execute();
		connection.close();
	}
	
	
	
	
}
