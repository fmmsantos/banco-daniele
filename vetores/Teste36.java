package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Teste36 {
	public static void main(String[] args) {
		int[] q = new int[4];
		int numero = 0;
		int quant=4;
		int maior = Integer.MIN_VALUE;
		Scanner c= new Scanner(System.in);
		int posicao = 0;
		for(int i=1;i<=q.length;i++) {
			
			System.out.println("Digite um numero"+i);
			q[i-1]=c.nextInt();
			
			if(q[i-1]>maior) {
				
				maior=q[i-1];
				posicao=i;
			}
			
			
		}
		 System.out.println("O maior número digitado foi: " + maior + ""+" e sua posição é:" + posicao);
		
	}
	

}
