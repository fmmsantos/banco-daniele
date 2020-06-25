package laçoRepetição;

import java.util.Scanner;

public class Teste13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor");
		int valor2 = sc.nextInt();
		while(valor2==0) {
			System.out.println("Digite um valor maior que 0");
			 valor2 = sc.nextInt();	
			
		}
		int total = valor1+valor2;
		System.out.println("a soma dos 2 valores é" + total);
	}
}
