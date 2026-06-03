package classeAbstrata;

public class JogoCartas extends Jogo {
	//atributo
	private String tipoBaralho;
	
	//construtor da classe
	public JogoCartas(String nome, int numeroJogadores, String tipoBaralho) {
		super(nome, numeroJogadores);
		this.tipoBaralho = tipoBaralho;
	}
	
	//consumir os métodos concretos e abstratos
	@Override
	public void iniciar() {
		//comportamento específico
		System.out.println("Jogo de Cartas: " + super.nome);
		//lógica de negócio
	}
	
	@Override
	public void exibirRegras() {
		System.out.println("Cada jogador deve jogar"
				+ " uma carta por vez");
	}
	
	@Override
	public String toString() {
		return super.toString()+
				" Tipo baralho: " + tipoBaralho;
	}
}
