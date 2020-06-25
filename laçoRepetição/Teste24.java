package laçoRepetição;

import java.util.Scanner;

public class Teste24 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int numeroMercadoria=0;
		System.out.println("qual a quant de mercadorias?");
		numeroMercadoria=c.nextInt();
		int merc;
		double valor;
		double total=0;
		for(int i=1;i<=numeroMercadoria;i++) {
		
		System.out.println("valor da "+i+"ª"+"mercadoria?");
		valor=c.nextDouble();
		total= total+valor;
		
		
		//
		}
		System.out.println(total);
	}

}
