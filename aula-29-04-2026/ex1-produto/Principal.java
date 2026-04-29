package estoque;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//criar o objeto Produto
		Produto produto = new Produto();
		
		//ler os dados
		System.out.println("Digite o nome do produto: ");
		produto.nome = scanner.nextLine();
		
		System.out.println("Digite o preço do produto: ");
		produto.preco = scanner.nextDouble();
		
		System.out.println("Digite a quantidade do produto: ");
		produto.quantidade = scanner.nextInt();
		
		System.out.println("\nDados do Produto:");
		produto.exibirDados();
		
		//entrada no estoque
		System.out.println("\nDigite a quantidade para add");
		int quantidadeAdicionar = scanner.nextInt();
		produto.entradaEstoque(quantidadeAdicionar);
		System.out.println("\nDados do produto após a entrada do estoque");
		produto.exibirDados();
		
		//remover no estoque
		System.out.println("\nDigite a quantidade para remover");
		int quantidadeRemover = scanner.nextInt();
		produto.saidaEstoque(quantidadeRemover);
		System.out.println("\nDados do produto após a retirada do estoque");
		produto.exibirDados();
		
		scanner.close();
		

	}

}
