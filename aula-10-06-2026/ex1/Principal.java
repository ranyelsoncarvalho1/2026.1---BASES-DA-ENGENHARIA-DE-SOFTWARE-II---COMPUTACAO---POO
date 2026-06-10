package interfaces;

public class Principal {

	public static void main(String[] args) {
		 // Criando um círculo e um retângulo
        Forma circulo = new Circulo(5.0);
        Forma retangulo = new Retangulo(4.0, 6.0);

        // Calculando e exibindo as áreas
        System.out.printf("Área do Círculo: %.2f\n" , circulo.calcularArea());
        System.out.printf("Perímetro do Círculo: %.2f\n" , circulo.calcularPerimetro());

        System.out.printf("Área do Retângulo: %.2f\n" , retangulo.calcularArea());
        System.out.printf("Perímetro do Retângulo: %.2f\n" , retangulo.calcularPerimetro());

	}

}
