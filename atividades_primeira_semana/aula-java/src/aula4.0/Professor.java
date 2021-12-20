package aula;

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
	@Override
	public String toString() {
		return "Professor [matriculaEmprego=" + matriculaEmprego + ", cargaHoraria=" + cargaHoraria + ", salario="
				+ salario + ", disciplinaMinistrada=" + disciplinaMinistrada + "]";
	}
	
	
	
}
