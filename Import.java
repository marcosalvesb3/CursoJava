package FundamentosJava;

import java.util.Date; // O Import vem sempre antes da classe

public class Import {
	
	public static void main(String[] args) {
		java.lang.String b = "Boa Tarde!!!";
		java.lang.System.out.println(b);
		
		String s = "Bom Dia!!!";
		System.out.println(s);
		
		Date d = new Date(); // sem o import o programa nao mostra a data
		
		System.out.println(d);
		
	}

}
