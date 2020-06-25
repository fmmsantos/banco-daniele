package laçoRepetição.aninhada;

public class Teste32 {

	public static void main(String[] args) {
		int result=10;
		int result2=10;
		for(int i=1;i<=result;i++) {
		System.out.print("(");
		System.out.print(i);
		System.out.print(",");
		
			for(int a=1;a<=result2;a++) {
				
				System.out.print(a);
			
			}
		
			System.out.print(")");	
		}

	}

}
