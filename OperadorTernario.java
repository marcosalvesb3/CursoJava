package Operadores;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		double media = 6;
		String resultadoFinal = media >= 7.0 ?
				"aprovado;" : "em recuperação";
		System.out.println("O aluno está " + resultadoFinal);
		
		
		
		
		double nota = 6;
		boolean bomComportamento = true;
		boolean passouPormédia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPormédia;
		String resultado = temDesconto ? "Sim" : "Não.";
		
		System.out.println("Tem desconto?" + temDesconto);
		
		System.out.printf("Tem desconto? %s", resultado);
		
		
		
	}

}
