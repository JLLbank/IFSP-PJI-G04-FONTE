package modelNegocio;

import view.Screen;

public class Menu {
	Screen tela = new Screen();
	
	public void menuPrincipal(int i) {
		switch(tela.escolhaMenu()) {
			case 0:
				System.out.println("Pagamento");
				break;
			case 1:
				System.out.println("Transferencia");
				break;
			case 2:
				tela.saldo(i);
				break;
			case 3:
				System.out.println("Depósito");
				break;	
			default:
				if(tela.temCertteza()==0) {
					System.exit(0);
				}
		}
	}
}
