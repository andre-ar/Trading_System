package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Conexao;
import beans.Cliente;

public class ClienteDAO {

	private Connection connection;
	
	
	public void inserir_cliente(Cliente cliente) throws SQLException{
		
		String sql = "insert into tb_cliente" + "(nome, endere�o, telefone, email, cpf)" + "values" + "(?,?,?,?,?)";
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
	
	
	
}
