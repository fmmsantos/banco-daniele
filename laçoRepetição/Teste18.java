package laçoRepetição;

import java.util.Scanner;

public class Teste18 {
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
	Integer result=0;
		System.out.println("Digite 3 cidades");
		for(int i=1;i<=3;i++) {
			System.out.println("Digite "+i+"ª"+ " cidade");
			String cidade = c.nextLine();

			
			if(cidade.startsWith("s")) {
				result++;
				
			}
				
		}
		System.out.println("Total : "+result);
	}

}
