package algoritmo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste4 {
	private static final ArrayList<Object> Integer = null;

	public static void main(String[] args) {
		
	Scanner c = new Scanner(System.in);
	int numero=0;

	List<Integer> result= new ArrayList<>();
	
	while(numero<100 || numero>9999) {
		System.out.println("Digite um numero entre 100 a 9999");
		numero = c.nextInt();
	}
	
	char[] digito= String.valueOf(numero).toCharArray();
	
	for(int i=0;i<digito.length;i++) {
		//System.out.println();
		if(digito[i]%2==0) {
		System.out.println(digito[i]);	
			}
		
		
	}
	c.close();
	//System.out.println(result);
	}
	public void numeroPar(int numero) {
		if(numero<100 && numero>999) {
			throw new IllegalArgumentException("voce nao pode digitar um numero maior que 9999 e menor que 100");
		}
		
		char[] digito= String.valueOf(numero).toCharArray();
		
		for(int i=0;i<digito.length;i++) {
			//System.out.println();
			if(digito[i]%2==0) {
			System.out.println(digito[i]);	
				}
			
			
		}
	}

}
