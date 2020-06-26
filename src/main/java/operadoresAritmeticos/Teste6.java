package operadoresAritmeticos;

import java.util.Scanner;

public class Teste6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor do carro novo:");
		double carroNovo = sc.nextFloat();
		
		double distrib = 0.28* carroNovo;
		double imposto = 0.45*carroNovo;
		
		double valorTotal = carroNovo + distrib + imposto;
		
		System.out.println("O valor do seu carro é " + valorTotal);
	}

}
