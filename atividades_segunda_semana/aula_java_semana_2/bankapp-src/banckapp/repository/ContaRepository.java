package banckapp.repository;

import banckapp.model.Conta;

public class ContaRepository {

	private Conta [] contas= new Conta [5];
	private int contadorContas=0;
	
	public void adicionarConta(Conta conta) {
	
		contas[contadorContas]=conta;
		contadorContas=contadorContas+1;
	}
	
	
	public void imprimirContas() {
		for (int i = 0; i < contas.length; i++) {

		Conta contAtual= contas[i];
		
		System.out.println(contAtual);
		}
	}
	
	
}
