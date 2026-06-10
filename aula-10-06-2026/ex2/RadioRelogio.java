package interfaces_2;

//Classe que representa um rádio relógio
public class RadioRelogio implements Radio, Relogio {
 private boolean ligado;
 private double estacaoAtual;
 
 public RadioRelogio() {
     this.ligado = false;        // Inicialmente o rádio está desligado
     this.estacaoAtual = 0.0;   // Estação inicial
 }

 @Override
 public void ligar() {
     ligado = true;
     System.out.println("Rádio Relógio está ligado.");
 }

 @Override
 public void desligar() {
     ligado = false;
     System.out.println("Rádio Relógio está desligado.");
 }

 @Override
 public void trocarEstacao(double novaEstacao) {
     if (ligado) {
         this.estacaoAtual = novaEstacao;
         System.out.println("Estação trocada para: " + novaEstacao + " MHz");
     } else {
         System.out.println("O rádio está desligado. Ligue o rádio primeiro.");
     }
 }

 @Override
 public String obterHoras() {
     // Simulando a obtenção da hora atual
     java.time.LocalTime agora = java.time.LocalTime.now();
     return agora.toString(); // Retorna a hora no formato HH:mm:ss
 }
 
 // Novo método para obter a estação atual
 public double obterEstacaoAtual() {
     return estacaoAtual; // Retorna a estação atual
 }
 
}
