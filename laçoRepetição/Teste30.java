package laçoRepetição;

import java.util.Arrays;
import java.util.Scanner;

public class Teste30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo;
		Double preco=0.0;
		int maiorValor=0;
		int media=0;
		
		int quant = 2;
		int[] array = new int[quant];
		
		for(int i=1;i<=quant;i++) {
			System.out.println("Digite o codigo do produto "+i);
			codigo=sc.nextInt();
			System.out.println("Digite o preço do produto "+i);
			preco = sc.nextDouble();
			
		array[i-1]=preco.intValue()	;
		media = (int) (media+preco-1);
			
		}
		Arrays.sort(array);
	System.out.println("maio preco "+ array[quant-1]);
		System.out.println("Media dos valores dos produtos: " + media/quant);

	
	
	}

}
