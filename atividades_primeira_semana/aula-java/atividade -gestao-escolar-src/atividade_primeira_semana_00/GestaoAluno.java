package atividade_primeira_semana_00;

import java.util.ArrayList;
import java.util.List;

public class GestaoAluno {

	List<Aluno> alunos= new ArrayList<Aluno>();
	
	private Double media;
	private Double av1;
	private Double av2;
	private Aluno a;
	private Professor p;
	
	

	public GestaoAluno() {

		a=new Aluno("Osmar José","132.123.654-98",14,"89785634","3001B","manhã");
		p=new Professor("Marcos Mario Monteiro","123.432.111-88",45,"22334455",36,2500.12,"Matemática","3001B");
	
	}
	
	public Aluno getA() {
		return a;
	}


	public void setA(Aluno a) {
		this.a = a;
	}

	public Double getMedia() {
		return media;
	}
	
	
	public void setMedia(Double media) {
		this.media = media;
	}


	public Double getAv1() {
		return av1;
	}
	public void setAv1(Double av1) {
		this.av1 = av1;
	}
	
	public Double getAv2() {
		return av2;
	}
	public void setAv2(Double av2) {
		this.av2 = av2;
	}
	
	public Professor getP() {
		return p;
	}

	public void setP(Professor p) {
		this.p = p;
	}
	
	public void verifica(Aluno a, Professor p) {
		if (p.getTurma().equals(a.getTurma())) {
			System.out.println("O professor "+p.getNome()+ " dá aula para "+a.getNome() );
			
		}else {
			System.out.println("O aluno "+a.getNome()+" não está na turma do professor "+p.getNome());
		}
		
	}
	
	public void mediaAluno(Aluno a) {
		media=(av1+av2)/2;
		System.out.println("A média do aluno "+a.getNome()+" é: " +media);
	}
	
	
	
}
