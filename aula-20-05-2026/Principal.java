package heranca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criar os objetos
		Professor professor = new Professor("Maria", 30, "Lógica de Programação");
		Aluno aluno = new Aluno("João", 21, "Cinema");
		Pessoa pessoa = new Pessoa("Ana", 15);
		
		//métodos sobrescritos
		professor.apresentar();
		aluno.apresentar();
		pessoa.apresentar();
		
		System.out.println(professor);
		
		professor.setDisciplina("Matemática");
		System.out.println(professor);
		
		aluno.setCurso("Engenharia de Software");
		System.out.println(aluno);
		
		pessoa.mostrarDetalhes();
		//professor.mostrarDetalhes(); não vai funcionar, pois o método é do tipo final

	}

}
