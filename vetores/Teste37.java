package vetores;

import java.util.Scanner;

public class Teste37 {
	
	public static void main(String[] args) {
		
		int posicao=4;
		int posicaoMenor=-1;
		int[] q = new int[posicao];
		int menor= Integer.MAX_VALUE;
		Scanner c= new Scanner(System.in);
		for(int i=1;i<=q.length;i++) {
			System.out.println("Digite "+i);
			q[i-1]=c.nextInt();
			if(q[i-1]<menor) {
				menor=q[i-1];
				posicaoMenor=i;
			}
			
			
		}
		System.out.println("menor valor " + menor + "posicao "+ posicaoMenor);
	}

}
