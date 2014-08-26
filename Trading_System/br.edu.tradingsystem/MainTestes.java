import java.sql.Connection;

import model.Conexao;


public class MainTestes {

	public static void main(String[] args) {
		Connection connection;
		 connection = new Conexao().getConnection();
		 
		 System.out.println(connection);
	}

}
