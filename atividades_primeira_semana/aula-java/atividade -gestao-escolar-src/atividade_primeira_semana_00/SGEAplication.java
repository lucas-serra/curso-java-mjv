package atividade_primeira_semana_00;

public class SGEAplication {

	public static void main(String[] args) {

		//a classe inicializadora tem menos implementacao
		Aluno pedro = new Aluno("Pedro José","132.123.654-98",14,"89785634","3001B","manhã");
		Disciplinas materia = new Disciplinas();
		GestaoAluno gestao= new GestaoAluno();
		Professor marcos = new Professor("Marcos Mario Monteiro","123.432.111-88",45,"22334455",36,2500.12,"Matemática","3001B");
		
		System.out.println("======================================");
		System.out.println("Exibindo informações sobre o aluno:");
		System.out.println("Nome: " +pedro.getNome());
		System.out.println("Matricula: " +pedro.getMatricula());
		System.out.println("CPF: "+pedro.getCpf());
		System.out.println("Idade: " +pedro.getIdade());
		System.out.println("Turma: " +pedro.getTurma());
		System.out.println("Turno: "+pedro.getTurno());
		
		materia.inscricaoDisciplinas(pedro);
		gestao.setAv1(9.2);
		gestao.setAv2(8.7);
		gestao.mediaAluno(pedro);
		
		System.out.println("======================================");
		marcos.setNome("Marcos Mario Monteiro");
		marcos.setIdade(34);
		marcos.setSalario(2500.00);
		marcos.setCpf("098.076.054-21");
		marcos.setMatriculaEmprego("98765432");
		marcos.setDisciplinaMinistrada("geografia");
		marcos.setCargaHoraria(36);
		marcos.setTurma("3001B");;
		
		System.out.println("Informações sobre o professor:");
		System.out.println("Nome: "+marcos.getNome());
		System.out.println("Matricula: "+marcos.getMatriculaEmprego());
		System.out.println("CPF: "+marcos.getCpf());
		System.out.println("Idade: "+marcos.getIdade());
		System.out.println("Disciplina ministrada: "+marcos.getDisciplinaMinistrada());
		System.out.println("Carga horária semanal: "+marcos.getCargaHoraria());
		System.out.println("Salário: "+marcos.getSalario());
		System.out.println("======================================");
		
		gestao.verifica(pedro, marcos);
		
		Aluno emanoel = new Aluno("Emanoel","123.123.654-98",14,"89785634","3002B","manhã");
		
		gestao.verifica(emanoel, marcos);
	}

}

