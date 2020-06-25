package laçoRepetição;

import java.util.Scanner;

public class Teste27 {

	public static void main(String[] args) {
		Integer numero=0;
		int media=0;
		Scanner c = new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
			System.out.println("Digite" +i+"um numero ");
			numero=c.nextInt();
			media = media+numero;
			
			
		}
		int total = media/5;
		System.out.println(total);
		System.out.println(numero.max(1,numero ));
		
		
	}
}
