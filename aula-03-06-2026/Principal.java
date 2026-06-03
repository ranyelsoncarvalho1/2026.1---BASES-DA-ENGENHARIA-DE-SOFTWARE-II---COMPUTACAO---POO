package classeAbstrata;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//não conseguimos instanciar o objeto Jogo (classe abstrata)
		//Jogo jogoCartas = new Jogo("Uno", 4);
		
		Jogo jogoTabuleiro = new JogoTabuleiro("Banco imobiliario", 2, "Quadrado");
		jogoTabuleiro.iniciar();
		jogoTabuleiro.exibirRegras();
		
		Jogo jogoCarta = new JogoCartas("Poker", 2, "Padrão");
		jogoCarta.iniciar();
		jogoCarta.exibirRegras();
	}

}
