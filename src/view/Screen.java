package view;

import javax.swing.*;
import modelDAO.DataBase;

public class Screen {
	DataBase dados = new DataBase();
	
	public void bemVindo() {
		JOptionPane.showMessageDialog(null, "Bem-vindo ao JLLbank.");
	}
	
	public int escolha() {
		String[] choices = {"Entre", "Cadastre-se", "Sair"};
		
		return JOptionPane.showOptionDialog(null, "Menu Opcoes."
, "Bem-Vindo ao JLLbank.", JOptionPane.YES_NO_OPTION
, JOptionPane.QUESTION_MESSAGE, null, choices, "Sair");
	}
	
	public void opcaoInvalida() {
		JOptionPane.showMessageDialog(null, "Opcao Invalida.");
	}
	
	public String informeConta() {
		return JOptionPane.showInputDialog("Conta");
	}
	
	public void bemVindoFulano(int i) {
	JOptionPane.showMessageDialog(null, "Bem-vindo "+dados.getDono(i)+".");
	}
	
	public void fulanoNaoEncontrado() {
		JOptionPane.showMessageDialog(null, "Usuario nao encontrado.");
	}
}
