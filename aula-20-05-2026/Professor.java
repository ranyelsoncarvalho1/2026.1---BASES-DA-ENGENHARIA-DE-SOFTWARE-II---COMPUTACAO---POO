package heranca;

public class Professor extends Pessoa {
	
	//atributos
	private String disciplina;
	
	//construtor
	public Professor(String nome, int idade, String disciplina) {
		super(nome, idade); //atributos da classe Pessoa
		this.disciplina = disciplina;
		
	}

	//modificadores 
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	//métodos específicos
	@Override
	public void apresentar() {
		super.apresentar(); //método presente na superclasse
		System.out.println("Disciplina: " + disciplina);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Disciplina: " + disciplina;
	}
	
	//@Override
	//não funciona, pois o método da superclasse é do tipo "final"
	//public void mostrarDetalhes() { 
	//	super.mostrarDetalhes();
	//}
}
