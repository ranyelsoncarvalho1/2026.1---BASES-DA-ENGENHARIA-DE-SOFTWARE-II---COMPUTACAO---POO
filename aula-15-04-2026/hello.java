//import
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		// comentário
		//fortemente tipada (tipos de dados)
		//variáveis
		String nome = "Fulano"; 
		int num1 = 10;
		double num2 = 10.3;
		float num3 = 10.3f;
		char letra = 'a';
		boolean booleano = true;
		String nomeCompleto = "Fulano da Silva";
		// int 5minutos
		int _5minutos;
		// int valor salario
		
		//leitura de dados com o Scanner
		Scanner sc = new Scanner(System.in); //instância da classe Scanner
		
		//entrada de dados;
		System.out.println("Informe um texto: ");
		String texto = sc.next(); 
		System.out.println(texto);
		
		System.out.println("Informe um número: ");
		double numero = sc.nextDouble();
		System.out.println("Número digitado: " + numero);
		
		sc.close(); //não precisa mais do objeto
		
		//utilizar as janelas
		String n = JOptionPane.showInputDialog("Nome: ");
		JOptionPane.showMessageDialog(null, "Nome digitado: " + n);
		
		//algoritmo: entrada + processamento + saída
		//dados de entrada
		String entrada1 = JOptionPane.showInputDialog("N1: ");
		String entrada2 = JOptionPane.showInputDialog("N2: ");
		
		
		//conversão
		int numero1 = Integer.parseInt(entrada1);
		int numero2 = Integer.parseInt(entrada2);
		
		//processamento
		int soma = numero1 + numero2;
		
		//saída: jogar o resultado em tela (JOptionPane)
		JOptionPane.showMessageDialog(null, soma);
		
		
	}

}
