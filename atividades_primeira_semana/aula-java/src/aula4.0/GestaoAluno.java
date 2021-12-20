package aula;

public class GestaoAluno {

	Aluno aluno = new Aluno();
	private Double media;
	private Double av1=9.2;
	private Double av2=8.5;
	
	public Double getMedia() {
		return media;
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
	public void mediaAluno() {
		media=(av1+av2)/2;
		System.out.println("A média do aluno "+aluno.getNome()+" é: " +media);
	}
	
	
}
