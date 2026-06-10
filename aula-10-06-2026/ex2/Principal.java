package interfaces_2;

//Classe principal para testar o rádio relógio
public class Principal {
 public static void main(String[] args) {
     RadioRelogio meuRadioRelogio = new RadioRelogio();

     // Testando o rádio relógio
     meuRadioRelogio.ligar(); // Liga o rádio
     System.out.println("Estação atual: " + meuRadioRelogio.obterEstacaoAtual() + " MHz"); // Obtém e exibe a estação atual
     meuRadioRelogio.trocarEstacao(101.5); // Troca a estação
     System.out.println("Hora atual: " + meuRadioRelogio.obterHoras()); // Obtém a hora
     meuRadioRelogio.desligar(); // Desliga o rádio
 }
}

