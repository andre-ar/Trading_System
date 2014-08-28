package beans;

public class Cliente {

	private String nome;
	private String endereco;
	private String email;
	private int telefone;
	private long cpf;


	// para clientes sem id sera considerado valor maximo

	public Cliente() {
		this.nome = "";
		this.cpf = 0;
		this.email = "";
		this.endereco = "";
		this.telefone = 0;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}



	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
