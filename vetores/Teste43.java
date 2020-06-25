package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Teste43 {
	public static void main(String[] args) throws Exception {
		int numero=5;
		int novo=-1;
		int novoValor =0 ;
		int[] vetor = new int[numero];
		
	
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=vetor.length;i++) {
			System.out.println("Digite o "+i);
			vetor[i-1]=s.nextInt();
			
		}
		Arrays.sort(vetor);
		for(int i:vetor) {
			System.out.println(i);
		}
		System.out.println("Digite um novo valor");
		novoValor = s.nextInt();
	
			
		
			
			if(numero == vetor.length) {
			
				for(int i=1; i<=vetor.length;i++) {
				
					System.out.println(vetor[i+1]);
			}
				//vetor=elementosNovos;
			//System.out.println(elementosNovos[vetor]);
			
		}
		
		}
			
		

	
			
			
		
		
	
}
