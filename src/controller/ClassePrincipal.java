package controller;

import modelDAO.Conta;
import view.Tela;

public class ClassePrincipal {
	public static void main(String[] args) {
		Conta baseDeDados = new Conta();
		Tela tela = new Tela();
		
		baseDeDados.dataBase();
		tela.incioSistema();
	}
}
