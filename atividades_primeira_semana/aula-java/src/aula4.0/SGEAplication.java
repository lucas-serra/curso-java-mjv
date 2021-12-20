package aula;

public class SGEAplication {

	public static void main(String[] args) {

		//a classe inicializadora tem menos implementacao
		Disciplinas materia = new Disciplinas();
		GestaoAluno gestao= new GestaoAluno();
		Aluno aluno=new Aluno();
		Professor professor= new Professor();
		
		
		aluno.setNome("Osmar José ");
		aluno.setCpf("234.123.789-70");
		aluno.setTurno("manhã");
		aluno.setTurma("702 A");
		aluno.setMatricula("09876543");
		aluno.setIdade(13);
		System.out.println("======================================");
		aluno.toString();
		materia.inscricaoDisciplinas();
		gestao.setAv1(9.2);
		gestao.setAv2(8.7);
		gestao.mediaAluno();
		
		System.out.println("======================================");
		professor.setNome("Marcos Mario Monteiro");
		professor.setIdade(34);
		professor.setSalario(2500.00);
		professor.setCpf("098.076.054-21");
		professor.setMatriculaEmprego("98765432");
		professor.setDisciplinaMinistrada("geografia");
		professor.setCargaHoraria(36);
		professor.toString();
		
		System.out.println("======================================");
		
	}

}
