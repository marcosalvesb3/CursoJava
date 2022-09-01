package Operadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println((a == b)); // IGUALDADE
		System.out.println(30 != 7);  // DIFERENÇA
		System.out.println(3 > 4);    // MAIOR QUE
		System.out.println(7 < 10);   // MENOR QUE
		System.out.println(4 >= 3);   // MAIOR OU IGUAL A
		System.out.println(5 <= 8);   // MENOR OU IGUAL A
		
		double nota = 9.0;
		boolean bomComportamento = false;
		boolean passouPormédia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPormédia;
		
		System.out.println("Tem desconto?" + temDesconto);
		
		
		
	}
}
