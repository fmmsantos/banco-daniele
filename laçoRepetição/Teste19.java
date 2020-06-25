package laçoRepetição;

import java.util.Scanner;

public class Teste19 {
	public static void main(String[] args) {
		
	
	Scanner c = new Scanner(System.in);
	int numero;
	int conf=0;

	for( int i = 1;i<=10;i++){
		System.out.println("Digite o "+i+"ª"+" numero");
		numero=c.nextInt();
		if(numero<0) {
			conf++;
		}
		

	}
	System.out.println(conf);

}}