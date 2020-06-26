package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Teste42 {
	public static void main(String[] args) {
		int numero=5;
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


	}
	
}
