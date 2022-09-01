package Operadores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nome = JOptionPane.showInputDialog(
				"Digite seu nome: ");
		String sobrenome = JOptionPane.showInputDialog(
				"Digite seu sobrenome: ");
		
		
		String saljun = JOptionPane.showInputDialog(
				"Quanto você ganhou no mês de junho? : ");
		String saljul = JOptionPane.showInputDialog(
				"Quanto você ganhou no mês de julho? : ");
		String salag = JOptionPane.showInputDialog(
				"Quanto você ganhou no mês de agosto? : ");
		
		
		 double saljunh = Double.parseDouble(saljun);
		 double saljulh = Double.parseDouble(saljul);
		 double salago = Double.parseDouble(salag);
		 
		 
		 double soma = saljunh + saljulh + salago;
		 double média = soma / 3;
		 
		 System.out.println( nome + sobrenome + " voce recebeu o total de: " + soma);
		 System.out.println("e a sua media salarial e: " + média);
		 

				 
				 
	//	double média = soma / 3;
	//	System.out.println("A sua média salarial dos ultimos 3 meses é: " + média);
		
		entrada.close();
		
		
		
				
	
				
				
	}
}
