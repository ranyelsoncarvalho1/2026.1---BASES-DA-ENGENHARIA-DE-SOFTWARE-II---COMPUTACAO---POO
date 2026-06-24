package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pedidos = new LinkedList<String>();
		
		//adicionar elemento na fila
		pedidos.add("Pedido 1");
		pedidos.add("Pedido 2");
		pedidos.add("Pedido 3");
		
		//visualizar a fila
		System.out.println("Lista de pedidos: " + pedidos);
		
		//pegar o elemento do inicio da fila
		System.out.println("Primeiro elemento: " + pedidos.peek());
		
		//visualizar o ultimo elemento da fila:
		System.out.println("Ultimo elemento: " + ((LinkedList<String>)pedidos).getLast());
		
		//remover o elemento da fila
		System.out.println("Remover o pedido " + pedidos.remove());
		
		System.out.println("Lista de pedidos: " + pedidos);
		System.out.println("Próximo pedido: " + pedidos.peek());
		

	}

}
