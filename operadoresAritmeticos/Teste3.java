package operadoresAritmeticos;

import java.util.Scanner;

public class Teste3 {
	public static void main(String[] args) {
		int idade;
		int dia;
		int mes;
		
		
		Scanner cs = new Scanner(System.in);
		System.out.println("Diga sua idade");
		idade = cs.nextInt();
		 dia = idade* 365;
		 mes = idade * 30;
		
		System.out.println(" Você tem " + idade +" tem :" + dia +" dias " +" tem :" + mes +" meses ");
	}

}
