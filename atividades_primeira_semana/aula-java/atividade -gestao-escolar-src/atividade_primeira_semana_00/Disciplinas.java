package atividade_primeira_semana_00;

import java.util.ArrayList;
import java.util.List;

public class Disciplinas {
	List<String> disciplinas = new ArrayList<String>();
	
	public void inscricaoDisciplinas(Aluno aluno) {
		disciplinas.add("matematica");
		disciplinas.add("portugues");
		disciplinas.add("ciencias");
		disciplinas.add("fisica");
		
		System.out.println("O aluno "+aluno.getNome()+ " est� inscrito em "+disciplinas.size()+" disciplinas.\nEst� inscrito nas disciplinas:\"");
		for (String string : disciplinas) {
			System.out.println(string);
		}
	}
}
