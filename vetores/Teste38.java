package vetores;

import java.util.Scanner;

public class Teste38 {
	public static void main(String[] args) {
	int posicao=4;	
	int x=0;
	int[] vetor =new int[posicao];
	int[] m= new int[4];
	
	Scanner c = new Scanner(System.in);
	
	for(int i=1;i<=vetor.length;i++) {
		System.out.println("Digite o " +i);
		vetor[i-1]= c.nextInt();	
		m[i-1]= posicao;
	}
	System.out.println("Digite mais um numero");
	x=c.nextInt();
	
	for(int i=1 ;i<=m.length;i++) {
		
	System.out.println(i*x);
	}
	
}
	
}