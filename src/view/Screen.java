package view;

import javax.swing.*;
import modelDAO.DataBase;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
	
	public int escolhaMenu() {
		String[] choices = {"Pagamento", "Transferencia", "Saldo", "Deposito"};
		
		return JOptionPane.showOptionDialog(null, "Menu Principal."
, "O que deseja fazer?", JOptionPane.YES_NO_OPTION
, JOptionPane.QUESTION_MESSAGE, null, choices, "Sair");
	}
	
	public int temCertteza() {
		return JOptionPane.showOptionDialog(null, "Deseja realmente sair?", "Sair", 
JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, "X");
	}
	
	public void saldo(int i) {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		JOptionPane.showMessageDialog(null, "___________________CONSULTA_SALDO___________________\n\nNome: "
+ dados.getDono(i)+"\nNumero da Conta: " + dados.getConta(i) + "\n\nSaldo Atual: R$" + dados.getValor(i) 
+ "\n\nData: " + formatoData.format(LocalDateTime.now()));
	}
	
}
