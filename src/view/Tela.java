package view;

import javax.swing.*;
import modelDAO.Conta;

public class Tela {
	public void incioSistema() {
		JOptionPane.showMessageDialog(null, "Inicio do Sistema.");
	}
	
	public String informeNumeroConta() {
		return JOptionPane.showInputDialog("Informe o Numero da Conta: ");
	}
	
	public void mostraSaldo(int i) {
		Conta baseDeDados = new Conta();
		System.out.println("-------------------SALDO---------------\n" + baseDeDados.getDono(i) + "\n\n" + baseDeDados.getConta(i) + "\n\nSaldo Total: " + baseDeDados.getValor(i));
	}
}
