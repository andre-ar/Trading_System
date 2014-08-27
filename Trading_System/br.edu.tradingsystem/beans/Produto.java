package beans;

public class Produto {

		private long id_produto;
		private double preco;
		private String nome;
		private String tipo;
		
		
		
		
		
		public Produto(long id_produto, double preco, String nome, String tipo) {
			super();
			this.id_produto = 0;
			this.preco = 0;
			this.nome = "";
			this.tipo = "";
		}
		public long getId_produto() {
			return id_produto;
		}
		public void setId_produto(long id_produto) {
			this.id_produto = id_produto;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	
}
