package laçoRepetição;

import java.util.Scanner;

public class Teste14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a 1ª nota");
		int nota1=sc.nextInt();
		
		while(nota1>10) {
			System.out.println("Digite um valor correto");
			
			nota1=sc.nextInt();		
		
		}
		
		System.out.println("Digite a segunda nota");
		int nota2=sc.nextInt();;
		while(nota2>10) {
			System.out.println("Digite um valor correto");
			
			nota2=sc.nextInt();		
		
		}
		double media = (nota1+nota2)/2;
		System.out.println(" sua nota é" + media);
		
		
	}

}
