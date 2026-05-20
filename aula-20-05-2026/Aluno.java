package heranca;

public class Aluno extends Pessoa {

	private String curso;
	
	public Aluno(String nome, int idade, String curso) {
		super(nome, idade); //atributos da classe pai
		this.curso = curso;
	}

	//modificadores
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//métodos
	@Override
	public void apresentar() {
		super.apresentar(); //método presente na superclasse
		System.out.println("Curso: " + curso);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Curso: " + curso;
	}

	
}
