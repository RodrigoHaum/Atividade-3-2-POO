package atv32;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends produto {
	
	private LocalDate fabricacao;

	public ProdutoUsado(String nome, Double preco, LocalDate fabricacao) {
		super(nome,preco);
		this.fabricacao = fabricacao;
	}

	public LocalDate getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(LocalDate fabricacao) {
		this.fabricacao = fabricacao;
	}
	
	@Override
	public String Etiqueta() {
		return getNome() + " - (usado) R$: " + String.format("%.2f", getPreco()) + 
				" - Data de frabricação: " + fabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
				" ;";
	}
	
}