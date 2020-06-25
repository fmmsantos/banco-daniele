package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Teste41 {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int dias=5;
		int[] temp = new int[dias];
		int maiorTempe = Integer.MIN_VALUE;
		int menorTempe = Integer.MAX_VALUE;
		int media = 0;
		int contagem = 0;
		System.out.println("Digite a temperatura dos dias do ano");
		for(int i=1;i<=temp.length;i++ ) {
			System.out.println(i+"ª dia");
			temp[i-1]=c.nextInt();
			menorTempe=temp[i-1];
			
			media = media+temp[i-1]/2;
			maiorTempe=temp[i-1];
			
		}
		Arrays.sort(temp);
		for(int mm : temp) {
			if(mm<media) {
			contagem++;	
			}
		}
		for(int i=1;i<=temp.length;i++) {
			if(temp[i-1]<menorTempe) {
				menorTempe=temp[i-1];
			}
			
		}
		for(int ii=1;ii<=temp.length;ii++) {
			if(temp[ii-1]>maiorTempe) {
				maiorTempe=temp[ii-1];
			}
		}
		
		System.out.println("Menor temperatura do ano: " + menorTempe);
		System.out.println("Maior temperatura do ano: "+ maiorTempe);
		System.out.println("Temperatura media: " + media);
		System.out.println("dias em que a temperatura foi menor que a media "+ contagem);
		
	}

}
