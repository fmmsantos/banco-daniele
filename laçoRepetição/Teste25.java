package laçoRepetição;

import java.util.Scanner;

public class Teste25 {
	public static void main(String[] args) {
		
	
	Scanner c = new Scanner(System.in);
	double valorMercadoria;
	
	String sn="S";
	double total=0;
	
	while(sn.equalsIgnoreCase("s")) {
		
		if(sn.equalsIgnoreCase("s")) {
			System.out.println("Qual o valor da mercadoria?");
			valorMercadoria=c.nextDouble();
			System.out.println("Mais Mercadorias S/N?");
			sn=c.next();
			total = total+valorMercadoria;	
			
		}
		else {
			
			break;
		}
		
		
	}
	System.out.println("Valor total da mercadoria é: " +total);
	
	
		
	}

}
