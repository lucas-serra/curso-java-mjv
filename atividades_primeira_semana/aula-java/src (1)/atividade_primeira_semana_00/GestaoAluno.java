package atividade_primeira_semana_00;

public class GestaoAluno {

	
	
	private Double media;
	private Double av1;
	private Double av2;
	private Aluno a;
	
	
	
	public Aluno getA() {
		return a;
	}


	public void setA(Aluno a) {
		this.a = a;
	}


	public GestaoAluno() {

		a=new Aluno("Osmar José","132.123.654-98",14,"89785634","3001B","manhã");
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
	public void historico() {
		
	}
	public void mediaAluno(Aluno a) {
		media=(av1+av2)/2;
		System.out.println("A média do aluno "+a.getNome()+" é: " +media);
	}
	
	
	
}
