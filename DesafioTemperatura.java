//DESAFIO 1 -- CONVERTER A TEMPERADURA DE ºF PARA ºC

package Operadores;

public class DesafioTemperatura {
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		
		//CONSTANTES
		 double FATOR = 5.0 / 9.0;
		 double AJUSTE = 32;
		
		//VARIÁVEIS
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "ºC.");
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "ºC");
	}

}
