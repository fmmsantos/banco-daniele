package operadoresAritmeticos;

import java.util.Scanner;

public class Teste9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a 1� nota");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a 2� nota");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a 3� nota");
		double nota3 = sc.nextDouble();
		
		double notaFinal = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		
		System.out.println("sua media final � " + notaFinal);
	}

	
}
