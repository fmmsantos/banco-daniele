package vetores;

import java.util.Scanner;

public class teste39 {
	public static void main(String[] args) {
		int posicao =3;
		String inverter;
		Scanner c = new Scanner(System.in);
		int[] vetor = new int[posicao];
		for(int i=1;i<=vetor.length;i++) {
			System.out.println("Digite o " +i);
			vetor[i-1]=c.nextInt();
		}
		for(int i=vetor.length;i>=1;i--) {
			
			System.out.println(vetor[i-1]);
			
			
		}
	}

}
