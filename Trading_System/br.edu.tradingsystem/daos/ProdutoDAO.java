package daos;

import java.util.List;

import beans.Produto;

public class ProdutoDAO implements GenericoDAO<Produto>{

	@Override
	public void inserir(Produto produto) throws PersistenciExcpetion {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Produto produto) throws PersistenciExcpetion {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int cpf) throws PersistenciExcpetion {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produto> listarTodos() throws PersistenciExcpetion {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto buscarPorcpf(int cpf) throws PersistenciExcpetion {
		// TODO Auto-generated method stub
		return null;
	}

}
