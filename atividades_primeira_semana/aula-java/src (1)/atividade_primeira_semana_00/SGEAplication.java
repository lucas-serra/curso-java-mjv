package atividade_primeira_semana_00;

public class SGEAplication {

	public static void main(String[] args) {

		//a classe inicializadora tem menos implementacao
		Aluno osmar = new Aluno("Osmar José","132.123.654-98",14,"89785634","3001B","manhã");
		Disciplinas materia = new Disciplinas();
		GestaoAluno gestao= new GestaoAluno();
		Professor professor= new Professor("Marcos Mario Monteiro","123.432.111-88",45,"22334455",36,2500.12,"Matemática");
		
		System.out.println(osmar.toString());
		System.out.println("======================================");
		
		
		materia.inscricaoDisciplinas(osmar);
		gestao.setAv1(9.2);
		gestao.setAv2(8.7);
		gestao.mediaAluno(osmar);
		
		System.out.println("======================================");
		professor.setNome("Marcos Mario Monteiro");
		professor.setIdade(34);
		professor.setSalario(2500.00);
		professor.setCpf("098.076.054-21");
		professor.setMatriculaEmprego("98765432");
		professor.setDisciplinaMinistrada("geografia");
		professor.setCargaHoraria(36);
		System.out.println(professor.toString());
		
		System.out.println("======================================");
		
	}

}

