package colecoes;

import java.util.ArrayList; //importação

public class ExemploArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Afonso");
		nomes.add("Alice");
		nomes.add("Bob");
		
		System.out.println("Nomes: " + nomes);
		nomes.add(0, "Teste"); //adicionar
		nomes.set(0, "Fulano"); //alterando um elemento
		//nomes.remove("Fulano");
		System.out.println("Nomes: " + nomes);
		System.out.println("Tamanho: " + nomes.size());
		
		//laço de repetição
		for(String nome : nomes) {
			System.out.println(nome);
		}
		//nomes.clear();
		System.out.println("Nomes: " + nomes);
		
		if (nomes.contains("AAlice")) {
			System.out.println("A lista contém o nome Alice");
		}

	}

}
