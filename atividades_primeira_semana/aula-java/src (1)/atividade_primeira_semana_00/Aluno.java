package atividade_primeira_semana_00;

public class Aluno extends Pessoa{
	
	private String matricula;
	private String turma;
	private String turno;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", turma=" + turma + ", turno=" + turno + ", getNome()=" + getNome()
				+ ", getCpf()=" + getCpf() + ", getIdade()=" + getIdade() ;
	}

	public Aluno(String nome, String cpf, int idade, String matricula, String turma, String turno) {
		super(nome, cpf, idade);
		this.matricula = matricula;
		this.turma = turma;
		this.turno = turno;
	}
	
	
	
	
	
	
}