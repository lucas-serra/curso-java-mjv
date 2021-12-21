package atividade_primeira_semana_00;

import java.util.ArrayList;
import java.util.List;

public class Turmas {
	private String id;
	private int numeroAlunos;
	private int numeroTurmas;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumeroAlunos() {
		return numeroAlunos;
	}
	public void setNumeroAlunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}
	public int getNumeroTurmas() {
		return numeroTurmas;
	}
	public void setNumeroTurmas(int numeroTurmas) {
		this.numeroTurmas = numeroTurmas;
	}
	public void adicionarAlunos(Aluno aluno) {
		List<Aluno> a= new ArrayList<Aluno>();
		
		a.add(aluno);
	}
	public void relacionandoProfessoresDisciplinas(Professor prof, Disciplinas disciplinas) {
		prof.setNome(id);
	}
	
	
}
