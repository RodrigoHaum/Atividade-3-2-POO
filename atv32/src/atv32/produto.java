package atv32;

public class produto {
	private String nome;
	private Double preco;
	
	public produto() {
		
	}
	
	public produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	} 
	
	public String Etiqueta() {
		return nome + " - R$" + String.format("%.2f", preco);
	}
	
	
}

