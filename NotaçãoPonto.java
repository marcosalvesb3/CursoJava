package FundamentosJava;

public class NotaçãoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String y = "Leo".toUpperCase();
		System.out.println(y);
		
		String X = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(X);
		
		// Tipos primitivos não tem o operador "."
		
		int a = 99;
		System.out.println(a);
		
	}

}
