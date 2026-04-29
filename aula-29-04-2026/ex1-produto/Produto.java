package estoque;

public class Produto {

	//atributos
	String nome;
	double preco;
	int quantidade;
	
	//métodos
	//calcular o valor total no estoque
	public double calcularValorTotal() {
		return preco * quantidade;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Valor Total: " + calcularValorTotal());
	}
	
	//adicionar no estoque
	public void entradaEstoque(int quantidadeAdicionada) {
		quantidade += quantidadeAdicionada;
	}
	
	//remover no estoque
	public void saidaEstoque(int quantidadeRemovida) {
		quantidade -= quantidadeRemovida;
	}
}
