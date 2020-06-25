package vetores;

import java.util.Scanner;

public class Teste34 {
	public static void main(String[] args) {
		String nome = "";
		int total = 3;
		Scanner c = new Scanner(System.in);
		String totalNome = "";
		String[] vetor = new String[total];
		for (int i = 1; i <= total; i++) {
			System.out.println("Digite o " + i + "ª nome");
			nome = c.nextLine();
			//totalNome = totalNome + nome + ",";

			vetor[i-1] = nome;

		}
		System.out.println("Digite mais um nome");
		String nome2 = c.nextLine();
		String achei="não achei";
		for(String s : vetor) {
			
			if (nome2.equals(s)) {
				 achei="achei";
			break;	
				
			}
			
		}
		
		System.out.println(achei);
			

		}
		
	

}
