package controller;

import view.Screen;
import modelNegocio.Login;

public class Main {
	public static void main(String[] args) {
		Screen tela = new Screen();
		Login log = new Login();
		
		tela.bemVindo();
		log.login();
	}
}
