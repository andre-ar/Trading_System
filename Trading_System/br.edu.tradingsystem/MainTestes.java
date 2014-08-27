import java.sql.Connection;
import java.sql.SQLException;

import daos.ClienteDAO;
import model.Conexao;
import beans.Cliente;


public class MainTestes {

	public static void main(String[] args) {
		Connection connection;
		 connection = Conexao.getInstance().getConnection();

		 
		 
		 
//		 Cliente dao = new Cliente("ricardo","aldeota","wemy@wemy",1235679982l,12341234);
//		 
//		 ClienteDAO cliente = new ClienteDAO();
//		 try {
//			cliente.removerCliente(12345679982l);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 //System.out.println(connection);
//	}

}
}