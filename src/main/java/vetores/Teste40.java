package vetores;

import java.util.Scanner;

public class Teste40 {
	public static void main(String[] args) {
		int v=0;
		
		
		
		Scanner c = new Scanner(System.in);
		System.out.println("Digite um valor");
		v=c.nextInt();
		int[] a=new int[v];
		int[] b = new int[v];
		int[] soma = new int[v];
		int[] soma1 = new int[soma.length];
		for(int i=1;i<=a.length;i++) {
			
			System.out.println("Digite valor "+i+" de A");
			a[i-1]=c.nextInt();
			
		}
		for(int i=1;i<=b.length;i++) {
			System.out.println("Digite valor b "+i+" de B");
			b[i-1]=c.nextInt();
			
		}
		
		for(int i=1;i<=soma.length;i++) {
			soma=a;
		}

		for(int i=1;i<=soma.length;i++) {
			soma=b;
			soma1[i-1] += a[i-1]+b[i-1]; 
		}
		for(int sss:soma1) {
			System.out.println(sss);
		}
	
			
			
		}
	

}
