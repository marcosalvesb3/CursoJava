package Operadores;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
	//	int a = 3 * 4 - 10;
	//	int b = (int) Math.pow(a, 3);
		
	//	System.out.println(b);
		
		int constante = 10;
		int a = 6;
		int b = 3 + 2;
		int c = (int) Math.pow(b, 2);
		int primeiroPasso = a * c;

		System.out.println(primeiroPasso);
		
		int d = 1 - 5;
		int e = 2 - 7;
		int f = d * e;
	    int g = f / 2;
	    int segundoPasso = (int) Math.pow(g, 2);
		
		System.out.println (segundoPasso);
		
		int res1 = primeiroPasso - segundoPasso; // resultado1
		
		System.out.println(res1);
		
		int res2 = (int) Math.pow(res1, 3);
		int cons3 = (int) Math.pow(constante, 3);
		
		int resultadoFinal = res2 / cons3;
		
		System.out.println(resultadoFinal);
		
				
		
		
		
		
		
		
		
				
				
		
		
		
		
	}

}
