package carro;

public class Carro {
	//atributos
	String modelo;
	String cor;
	int ano;
	
	//construtor
	Carro(){
		System.out.println("Teste de construtor");
	}
	
	Carro(String modelo, String cor, int ano){
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	//métodos (funções)
	public void exibirInformacoes() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Ano: " + ano);
	}
}
