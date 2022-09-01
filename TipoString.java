package Fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola Pessoal".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!")); 
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));                                     // A FRASE COMEÃ‡A?
		System.out.println(s.toLowerCase().startsWith("boa"));                       // TRANSFORMA A FRASE TODA EM LETRA MINUSCULA -- A FRASE COMEÃ‡A?
		System.out.println(s.toUpperCase().endsWith("TARDE"));                       // TRANSFORMA A FRASE TODA EM LETRA MAIUSCULA -- A FRASE TERMINA?
		System.out.println(s.length());                                              // MEDE O TAMANHO DA STRING, TRAZENDO UM NUMERO INTEIRO
		System.out.println(s.toLowerCase().equals("boa tarde"));                     // COMPARA DOIS OBJETOS, GARANTE QUE OS DOIS SEJAM CONSIDERADOS IGUAIS
		System.out.println(s.equalsIgnoreCase("boa tarde"));                         // COMPARA SE DUAS STRINGS SÃƒO IGUAIS
		
		var nome = "Marco";
		var sobrenome = "Alves";
		var idade = 25;
		var salario = 1500.98;
		
		System.out.println("Nome " + nome 
				+ "\nSobrenome: " + sobrenome
				+ "\nSalario: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
			   nome, sobrenome, idade, salario);
		System.out.println(frase);
	}

}
