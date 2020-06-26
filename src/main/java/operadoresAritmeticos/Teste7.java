package operadoresAritmeticos;

import java.util.Scanner;

public class Teste7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salario Fixo");
		double salarioFixo = sc.nextDouble();
		double comissaoFixa = 0.05;
		
		System.out.println("Numeros de carros vendido");
		int carrosVendidos = sc.nextInt();
		
		double valorDeCadaCarro = 20.0000;
		
		double valorTotalCarros = valorDeCadaCarro*carrosVendidos;
		
		double comissaoFixaTotal = valorTotalCarros*comissaoFixa;
		double salarioFinalVendedor= salarioFixo+ comissaoFixaTotal;
		
		System.out.println("Numeros de carros vendidos " + carrosVendidos);
		System.out.println("Valor total das Vendas "+ valorTotalCarros);
		System.out.println(" SalarioFinalVendedor "+ salarioFinalVendedor);
				
		
	}

}
