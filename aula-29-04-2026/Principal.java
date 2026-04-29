package carro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criar um objeto da classe Carro
		Carro meuCarro1 = new Carro();
		Carro meuCarro2 = new Carro();
		
		//Definir os atributos do objeto carro
		meuCarro1.modelo = "Sedan";
		meuCarro1.cor = "Vermelho";
		meuCarro1.ano = 2021;
		
		meuCarro2.modelo = "SUV";
		meuCarro2.cor = "Azul";
		meuCarro2.ano = 2025;
		
		//chamar o método da classe Carro
		meuCarro1.exibirInformacoes();
		meuCarro2.exibirInformacoes();
		
		Carro meuCarro3 = new Carro("Compacto", "amarelo", 2010);
		meuCarro3.exibirInformacoes();
	}

}
