package controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Cliente;
import beans.Controll;

public class RemoveCliente implements Controll{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) {
		
		long cpf = Long.parseLong(request.getParameter("cpf"));
		
		Cliente  cliente = new Cliente();
		
		cliente.setCpf(cpf);
	
		Connection connection = (Connection) request.getAttribute("connection");
				
		
			
		return null;
	}

	
	
}
