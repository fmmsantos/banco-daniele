package logicaProgramacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste44 {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		System.out.println("Digite quantas meias ");
		int meia = c.nextInt();
		int[] meias = new int[meia];
		for (int i = 0; i < meia; i++) {
			System.out.println("Digite a meia " + i);
			meias[i] = c.nextInt();
		}

		Teste44 teste = new Teste44();
		teste.calcularPares(meias);
	}

	public int calcularPares(int[] meias) {
		int pares = 0;

		List<Integer> meiasUsadas = new ArrayList<>();
		for (int i = 0; i < meias.length; i++) {
			System.out.println("meias " + i);
		}
		for (int i = 0; i < meias.length; i++) {
			if (meiasUsadas.contains(i)) {
				continue;
			}

			int elementoI = meias[i];
			for (int j = i + 1; j < meias.length; j++) {
				if (meiasUsadas.contains(j)) {
					continue;
				}
				int elementoJ = meias[j];
				if (elementoI == elementoJ) {
					pares++;
					meiasUsadas.add(i);
					meiasUsadas.add(j);
					break;
				}
			}
		}
		for (int i = 0; i < meias.length; i++) {
			System.out.println(meias[i]);
		}

		System.out.println("Pares: " + pares);

		return pares;
	}

}
