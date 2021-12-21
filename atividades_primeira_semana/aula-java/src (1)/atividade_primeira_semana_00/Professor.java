package atividade_primeira_semana_00;

public class Professor extends Pessoa{
	private String matriculaEmprego="00789654";
	private int cargaHoraria=36;
	private double salario=2600.00;
	private String disciplinaMinistrada="matematica";
	
	public String getMatriculaEmprego() {
		return matriculaEmprego;
	}
	public void setMatriculaEmprego(String matriculaEmprego) {
		this.matriculaEmprego = matriculaEmprego;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getDisciplinaMinistrada() {
		return disciplinaMinistrada;
	}
	public void setDisciplinaMinistrada(String disciplinaMinistrada) {
		this.disciplinaMinistrada = disciplinaMinistrada;
	}
	@Override
	public String toString() {
		return "Professor [matriculaEmprego=" + matriculaEmprego + ", cargaHoraria=" + cargaHoraria + ", salario="
				+ salario + ", disciplinaMinistrada=" + disciplinaMinistrada + ", Nome=" + getNome()
				+ ", Cpf=" + getCpf() + ", Idade=" + getIdade();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((matriculaEmprego == null) ? 0 : matriculaEmprego.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (matriculaEmprego == null) {
			if (other.matriculaEmprego != null)
				return false;
		} else if (!matriculaEmprego.equals(other.matriculaEmprego))
			return false;
		return true;
	}
	public Professor(String nome, String cpf, int idade, String matriculaEmprego, int cargaHoraria, double salario,
			String disciplinaMinistrada) {
		super(nome, cpf, idade);
		this.matriculaEmprego = matriculaEmprego;
		this.cargaHoraria = cargaHoraria;
		this.salario = salario;
		this.disciplinaMinistrada = disciplinaMinistrada;
	}
	
	
	
	
	
}
