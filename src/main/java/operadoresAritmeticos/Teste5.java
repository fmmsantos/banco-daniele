package operadoresAritmeticos;

import java.util.Scanner;

public class Teste5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu Salario");
		double salario = sc.nextInt();
		System.out.println("Digite a pocentagem de reajuste");
		
		double reajuste = sc.nextInt();
		 reajuste = 0.30*salario;
		 double novoSalario = reajuste + salario;
		System.out.println("Seu salario aumentou para : " + novoSalario);
	}

}
