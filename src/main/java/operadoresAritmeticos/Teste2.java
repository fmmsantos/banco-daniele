package operadoresAritmeticos;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		int base ;
		int altura;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do retangulo");
		base = sc.nextInt();
		System.out.println("Digite a altura do retangulo");
		altura = sc.nextInt();
		
		double result = (base*2)+(altura*2) ;
		System.out.println("O valor da soma é" + result);
		
		
	}
}
