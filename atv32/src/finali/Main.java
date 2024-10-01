package finali;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atv32.produto;
import atv32.ProdutoImportado;
import atv32.ProdutoUsado;

// System.out.println();
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<produto> list = new ArrayList<>();
		
		System.out.println("Digite o numero de produtos a ser processado: ");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			System.out.println();
			System.out.println("Digite o tipo de produto entre (c/u/i): ");
			char tipo = sc.next().charAt(0);
			System.out.println();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Preço: ");
			double preco = sc.nextDouble();
			if(tipo == 'c') {
				list.add(new produto(nome,preco));
			}
			else if(tipo == 'u') {
				System.out.println();
				System.out.println("Data de fabricação: ");
				LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new ProdutoUsado(nome,preco,data));
			}
			else {
				System.out.println();
				System.out.println("Taxa alfandegaria: ");
				double taxa = sc.nextDouble();
				list.add(new ProdutoImportado(nome,preco,taxa));
			}
			
		}
		System.out.println();
		System.out.println("Etiquetas de preço: ");
		for(produto prod:list) {
			System.out.println(prod.Etiqueta());
		}
		sc.close();
	}

}
