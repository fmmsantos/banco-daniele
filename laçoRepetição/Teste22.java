package laçoRepetição;

import java.util.Scanner;

public class Teste22 {
	
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		int result =0;
		for(int i=1;i<=10;i++) {
			System.out.println("Digite o " +i+"ª " +"numero");
			int numero = c.nextInt();
			result = result+numero;
			
		}
			System.out.println(result);
	}

}
