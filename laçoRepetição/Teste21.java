package laçoRepetição;

import java.util.Scanner;

public class Teste21 {
public static void main(String[] args) {
		
		int contagem=0;
		Scanner c = new Scanner(System.in);
		int numero=0;
		for(int i = 1; i<=3;i++) {
			
			System.out.println("Digite"+i+"ª"+"numero");
			numero = c.nextInt();
			contagem = contagem+numero;
			
		}
		System.out.println(("a media é "+contagem/3));
		}
		
			
		}


