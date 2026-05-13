package encapsulamento;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criar o objeto
		ContaBancaria conta1 = new ContaBancaria("Fulano", 1264);
		
		conta1.exibirDados();	

		//modificador privado
		//conta1.saldo = 1000; é um atributo privado
		
		conta1.depositar(10);
		conta1.exibirDados();
		conta1.sacar(5);
		System.out.println("Saldo atual: " + conta1.getSaldo());
		
		//trocar o nome do titular
		conta1.setTitular("");
		conta1.exibirDados();
		
		conta1.sacar(1000);
	}

}
