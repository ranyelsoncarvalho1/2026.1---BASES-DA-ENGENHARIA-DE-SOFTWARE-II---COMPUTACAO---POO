package interfaces;

public class Circulo implements Forma {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio; //formula da área do circulo
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * raio; //formula do perímetro do círculo
	}

}
