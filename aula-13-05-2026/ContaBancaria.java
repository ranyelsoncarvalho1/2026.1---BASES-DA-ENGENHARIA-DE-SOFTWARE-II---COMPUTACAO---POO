package encapsulamento;

public class ContaBancaria {
	
	//atributos privados
	private String titular;
	private int numeroConta;
	private double saldo;
	
	//construtor
	public ContaBancaria(String titular, int numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
	}
	
	//metodos publicos (modificadores - encapsulamento)
	public void setTitular(String titular) {
		if (titular != null && !titular.isEmpty()) {
			this.titular = titular;
		} else {
			System.out.println("Nome inválido");
		}
	}
	
	public String getTitular() {
		return titular;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	//metodos para o comportamento da classe
	public void depositar(double valor) {
		if(valor >0) {
			saldo += valor;
			System.out.println("Depósito realizado com sucesso");
		} else {
			System.out.println("Valor inválido para depósito");
		}
	}
	
	public void sacar(double valor) {
		if(valor <=0) {
			System.out.println("Valor inválido");
		} else if(valor > saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso");
		}
	}
	
	public void exibirDados() {
		System.out.println("Titular: " + titular);
		System.out.println("Conta: " + numeroConta);
		System.out.println("Saldo R$: " + saldo);
	}
}
