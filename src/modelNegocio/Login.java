package modelNegocio;

import view.Screen;
import modelDAO.DataBase;

public class Login {
	Screen tela = new Screen();
	DataBase dados = new DataBase();
	
	public void login() {
		switch(tela.escolha()) {
			case 0:
				usuario();
				break;
			case 1:
				System.exit(0);
				break;
			case 2:
				System.exit(0);
				break;
			default:
				tela.opcaoInvalida();
		}
	}
	
	public void usuario() {
		String aux = null;
		
		do{
			aux = tela.informeConta();
		}while(aux==null);
		
		boolean aux2 = false;
		for(int i=0; i<dados.getTamanhoArrayDados(); i++) {
			if(aux.equals(dados.getConta(i))) {
				aux2 = true;
				tela.bemVindoFulano(i);
			}
		}
		if(aux2==false) {
			tela.fulanoNaoEncontrado();
		}
	}
}
