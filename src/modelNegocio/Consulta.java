package modelNegocio;

import modelDAO.Conta;
import view.Tela;

public class Consulta {
	public void saldo() {
		Conta baseDeDados = new Conta();
		Tela tela = new Tela();
		
		for(int i=0; i<7; i++) {
			if(tela.informeNumeroConta().contentEquals(baseDeDados.getConta(i))) {
				tela.mostraSaldo(i);
			}
		}
	}
}
