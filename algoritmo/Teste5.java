package algoritmo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste5 {
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		int numero=0;
		List<Integer> quant = new ArrayList<>();
		
		if(numero<0 ) {
			throw new IllegalArgumentException("Digite um numero positivo");
		}
		for(int i=0;i<10;i++) {
			System.out.println("Digite um numero");
			numero=c.nextInt();
			if(numero==0) {
				break;
			}
			quant.add(numero);
			
		}
		for(Integer i:quant) {
			if(i>5) {
				System.out.println(i);	
			}
			
		}
	
	}
	

}
