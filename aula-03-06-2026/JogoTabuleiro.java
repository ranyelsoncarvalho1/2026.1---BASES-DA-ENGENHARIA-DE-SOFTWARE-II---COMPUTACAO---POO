package classeAbstrata;

public class JogoTabuleiro extends Jogo {
	//atributos
	private String tipoTabuleiro;
	
	//construtor
	public JogoTabuleiro(String nome, int numeroJogadores, String tipoTabuleiro) {
		super(nome, numeroJogadores);
		this.tipoTabuleiro = tipoTabuleiro;
	}
	
	//métodos abstratos e concretos
	@Override
	public void iniciar() {
		System.out.println("Jogo de tabuleiro: " + super.nome);
	}
	
	@Override
	public void exibirRegras() {
		System.out.println("Cada jogador deve mover "
				+ "suas peças no tabuleiro");
	}
	
	@Override
	public String toString() {
		return super.toString() + " Tipo tabuleiro: " + tipoTabuleiro;
	}
}
