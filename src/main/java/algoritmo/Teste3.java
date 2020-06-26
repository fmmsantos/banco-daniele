package algoritmo;

import java.util.Scanner;

public class Teste3 {
	public static void main(String[] args) {
		double valorPaozinho=0.21;
		double valorBroa=1.50;
	double	quantDeVenda;
	double poupar=0.10;
	
	Scanner c = new Scanner(System.in);
	System.out.println("Quantas pãozinhos foram vendidos?");
	int quantPao = c.nextInt();
	System.out.println("Quantas broas foram vendidos");
	int quantBroa = c.nextInt();
	
	quantDeVenda = (quantPao*0.21)+(quantBroa*1.50);
	System.out.println("Tota de vendidos " + quantDeVenda);
	
	poupar = 0.10 * quantDeVenda;
	System.out.println("Para guardar na poupança "+ poupar);
	
	
	
	
	
	}

}
