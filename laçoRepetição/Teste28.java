package la�oRepeti��o;

import java.util.Scanner;

public class Teste28 {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		
		int codigo=0;
		double preco=0;
		double media=0;
		for(int i =1 ; i<=3;i++) {
			System.out.println("Qual o codigo do produto "+i);
			codigo = cs.nextInt();
			System.out.println("Qual o pre�o do produto "+i);
			preco=cs.nextDouble();
			media = media+preco;
		}
		Double total=0.0;
		System.out.println("Maior pre�o: "+total.max(preco, preco));
		System.out.println("A m�dia �: " + media/15);
	}
	

}
