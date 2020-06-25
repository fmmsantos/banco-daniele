package laçoRepetição;

import java.util.Scanner;

public class Teste20 {
	public static void main(String[] args) {
		
		
		Scanner c = new Scanner(System.in);
		int numero;
		int conf=0;
		int conf2=0;

		for( int i = 1;i<=10;i++){
			System.out.println("Digite o "+i+"ª"+" numero");
			numero=c.nextInt();
			if(numero<=10 ||numero<=20) {
				conf++;
			}
			else {
				conf2++;
			}
			
			
		}
		System.out.println("dentro do intervalo" +conf);
		System.out.println("fora do interfalo "+ conf2);
	}

}
