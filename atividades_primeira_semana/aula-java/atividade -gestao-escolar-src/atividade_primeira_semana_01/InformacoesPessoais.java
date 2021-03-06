package atividade_primeira_semana_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InformacoesPessoais {
	public static void main(String[] args) {
		Pessoa lucas= new Pessoa(21,"Lucas Dias Serra","146.184.067-90",false,"lucasdserra1234@gmail.com",1.75,999956924,"11/11/2000");
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		
		try {
			data= formato.parse(lucas.getDataNascimento());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("Nome:"+lucas.getNome());
		System.out.println("Altura:"+lucas.getAltura());
		System.out.println("Cpf:"+lucas.getCpf());
		System.out.println("Email:"+lucas.getEmail());
		System.out.println("Telefone:"+lucas.getTelefone());
		System.out.println("? doador de org?o?"+lucas.isDoadorOrgao());
		System.out.println("Data nascimento:"+formato.format(data));
	}
	
}
