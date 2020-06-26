package operadoresAritmeticos;

import java.util.Scanner;

public class Teste4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os votos válidos");
		int valido = sc.nextInt();
		
		System.out.println("Digite os votos nulos");
		int nulo = sc.nextInt();
		System.out.println("Digite os votos brancos");
		int branco = sc.nextInt();
		
		int totalVotos = valido + nulo + branco;
		
		
		
		System.out.println(" O total de voltos são: " + totalVotos);
		valido = valido / totalVotos*100;
		System.out.println( "Votos Validos " + valido);
		nulo = (nulo / totalVotos)*100;
		System.out.println( "Votos Nulos " + nulo);
		branco = (branco / totalVotos)*100;
		System.out.println( "Votos Brancos " +branco);
		
		
	}

}
