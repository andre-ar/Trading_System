package daos;

import java.util.List;

public interface GenericoDAO<T> {

	void inserir(T obj) throws PersistenciExcpetion;
	
	void atualizar(T obj) throws PersistenciExcpetion;

	void deletar(int cpf) throws PersistenciExcpetion;
	
	List<T> listarTodos() throws PersistenciExcpetion;
	
	T buscarPorcpf(int cpf) throws PersistenciExcpetion;
	
}
