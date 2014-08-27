package daos;

import java.util.List;
import beans.Cliente;

public class ClienteDAO1 implements GenericoDAO<Cliente> {

	@Override
	public void inserir(Cliente cliente) throws PersistenciExcpetion {

	}

	@Override
	public void atualizar(Cliente cliente) throws PersistenciExcpetion {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int cpf) throws PersistenciExcpetion {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> listarTodos() throws PersistenciExcpetion {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarPorcpf(int cpf) throws PersistenciExcpetion {
		// TODO Auto-generated method stub
		return null;
	}

}
