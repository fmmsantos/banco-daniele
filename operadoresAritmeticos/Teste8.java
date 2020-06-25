package operadoresAritmeticos;

import java.util.Scanner;

public class Teste8 {

	public static void main(String[] args) {
		double celsius;
		int fahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura");
		fahrenheit = sc.nextInt();
		celsius = (fahrenheit-32)/1.8;
		
		System.out.println("Graus em celsius " + celsius);
		
	}

}
