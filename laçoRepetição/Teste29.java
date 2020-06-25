package laçoRepetição;

import java.util.Arrays;
import java.util.Scanner;

public class Teste29 {
	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		System.out.println("Qual a quantidade de habitantes: ");
		int habitantes = c.nextInt();
		double salario = 0.0;
		int filho = 0;
		double mediaSalario = 0.0;
		int mediaFilhos = 0;
		;
		Double maiorSalario = 0.0;
		Double maiors = 0.0;
		int pessoaSalarioMenor=0;
		double[] a = new double[habitantes];
		for (int i = 1; i <= habitantes; i++) {
			System.out.println("Salario do "+i + " habitante");
			salario = c.nextDouble();

			System.out.println("Numeros de filhos  "  + "habitante");
			filho = c.nextInt();
			mediaSalario = mediaSalario + salario;
			mediaFilhos = mediaFilhos + filho;
			if (salario <= 150) {
				pessoaSalarioMenor++;
			
			}

			a[i-1] = salario;

		}
		
		Arrays.sort(a);
		int pocentagem = pessoaSalarioMenor / habitantes *100;

		System.out.println("media Salario " + mediaSalario / habitantes);
		System.out.println("media filhos " + mediaFilhos / habitantes);
		System.out.println("maior salario: " + a[habitantes-1]);
		System.out.println(pocentagem+"%");

	}
}
