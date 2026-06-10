package interfaces;

public class Retangulo implements Forma {

	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return largura * largura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (largura * altura);
	}

}
