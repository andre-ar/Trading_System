package beans;

public class Funcionario {

	private long id_funcionario;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private int cpf;
	

	
	
	public Funcionario() {
		
		this.id_funcionario = 0;
		this.nome = "";
		this.endereco = "";
		this.telefone = "";
		this.email = "";
		this.cpf = 0;
	
	}
	public long getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(long id_funcionario) {
		this.id_funcionario = id_funcionario;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
