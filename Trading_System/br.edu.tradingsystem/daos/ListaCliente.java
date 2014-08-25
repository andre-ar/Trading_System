package daos;

import java.lang.reflect.Array;
import java.util.ArrayList;

import beans.Cliente;

public class ListaCliente {
ArrayList<Cliente> listaCliente;

public ListaCliente() {
	this.listaCliente = new ArrayList<Cliente>();
}

public void adicionarCliente(Cliente cli){
	this.listaCliente.add(cli);
}

public Cliente procurarClienteBycpf(int cpf){
	
	for(int i=0; i<listaCliente.size();i++){
		if( cpf == listaCliente.get(i).getCpf()){
			return listaCliente.get(i);	
		}
	}
	return null;
}

}
