package aula;

import java.util.ArrayList;
import java.util.List;

public class Disciplinas {
	Aluno aluno= new Aluno();
	List<String> disciplinas= new ArrayList<String>();
	
	public void inscricaoDisciplinas() {
		disciplinas.add("Portugu�s");
		disciplinas.add("Matem�tica");
		disciplinas.add("Hist�ria");
		disciplinas.add("Ciencias");
		
		System.out.println("O aluno "+aluno.getNome()+"\nEst� inscrito em "+disciplinas.size()+" disciplinas.");
		for (String res : disciplinas) {
			System.out.println(res);
		}
		
	}
	
	
}