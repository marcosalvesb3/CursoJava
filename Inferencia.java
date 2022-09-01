package Fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		
		double a = 4.5;              //DECLARAÇÃO INICIALIZADA
		System.out.println(a);
		
		a = 12;                      //DECLARAÇÃO INICIALIZADA  
		System.out.println(a);
		
		//USANDO O VAR O JAVA RECONHECE QUAL TIPO DE VARIÁVEL E
		//NÃO PERMITE QUE COLOQUE ALGO QUE NAO FOR DA CLASSE RECONHECIDA.
		//EX:
			
		var b = 4.5; 
		System.out.println(b);
		
		// var c = "Texto"  TIRA A BARRA PRA VER O ERRO
				
		// c = "Outro"
		
		double d;                  //VARIAVEL FOI DECLARADA
		d = 154686.65;            //VARIAVEL FOI INICIALIZADA
		System.out.println(d);   //USADA
	}

}
