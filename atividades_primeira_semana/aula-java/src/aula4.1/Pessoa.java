package aula4;


public class Pessoa {
	
	
		private int idade=21;
		private String nome="Emanoel Estevam";
		private String cpf="14618506780";
		private boolean doadorOrgao= false;
		private String email= "emanoel@gmail.com";
		private double altura= 1.75;
		private int telefone=99993243;
		private String dataNascimento= "11/11/2000";
		
		
		
		public String getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public boolean isDoadorOrgao() {
			return doadorOrgao;
		}
		public void setDoadorOrgao(boolean doadorOrgao) {
			this.doadorOrgao = doadorOrgao;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		@Override
		public String toString() {
			return "Pessoa [idade=" + idade + ", nome=" + nome + ", cpf=" + cpf + ", doadorOrgao=" + doadorOrgao
					+ ", email=" + email + ", altura=" + altura + ", telefone=" + telefone + ", dataNascimento="
					+ dataNascimento + "]";
		}
		public Pessoa(int idade, String nome, String cpf, boolean doadorOrgao, String email, double altura,
				int telefone, String dataNascimento) {
			super();
			this.idade = idade;
			this.nome = nome;
			this.cpf = cpf;
			this.doadorOrgao = doadorOrgao;
			this.email = email;
			this.altura = altura;
			this.telefone = telefone;
			this.dataNascimento = dataNascimento;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pessoa other = (Pessoa) obj;
			if (cpf == null) {
				if (other.cpf != null)
					return false;
			} else if (!cpf.equals(other.cpf))
				return false;
			return true;
		}
				
		
		
		

		
		
		
}
	
	
