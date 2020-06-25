package operadoresRelacionais;

import java.util.Scanner;

import operadoresAritmeticos.Utilitaria;

public class Teste10 {
	public static void main(String[] args) {
		int maior ;
		String menor= "S";
		
	Scanner sc = new Scanner(System.in);
	

		System.out.println("Adicione um numero:");
		maior = sc.nextInt();
		
		if(maior > 10) {
			System.out.println("Numero maior que 10");
			
		}
		else {
			System.out.println("Numero menor que 10");
		}
		
		
		
	} 
	

}
