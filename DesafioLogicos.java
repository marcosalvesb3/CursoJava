package Operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		//Trabalho na terça (V ou F)
		// Trabalho na quinta (V ouF)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = (trabalho1 && trabalho2);
		boolean comprouTV35 = (trabalho1 ^ trabalho2);
		boolean comprouSorvete = (trabalho1 || trabalho2);
		
		//Operador Unário
		
		boolean emcasa = (!comprouSorvete);
		
		System.out.println("Comprou TV de 50? " + comprouTV50);
		System.out.println("Comprou TV de 35? " + comprouTV35);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		
		System.out.println("Ficou em casa? " + emcasa);
	
		
		
		
		
	//	System.out.println(trabalho1 && trabalho2);
	//	System.out.println(trabalho1 || trabalho2);
	//	System.out.println(trabalho1 ^ trabalho2);
	//	System.out.println(!!trabalho1);
	//	System.out.println(!trabalho2);
		
		
				
		
		
	}
}
