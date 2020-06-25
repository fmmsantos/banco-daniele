package vetores;

import java.util.Scanner;

public class Teste35 {
	public static void main(String[] args) {
		
	int aluno=5;
	double nota = 0;
	double media=0.0;
	Double mediat=0.0;
	double[] array = new double[aluno];
	Scanner c=new Scanner(System.in);
	
	for(int i=1; i<=aluno;i++) {
		System.out.println("Digite a "+i+"ª"+ "nota");
		nota=c.nextDouble();
		array[i-1]=nota;
			
	}
	for(Double d:array) {
	//	System.out.println(d);
		media = media+d;			
	}
	
	mediat=media/aluno;
	int quantAlunosAcima=0;
	for(Double d:array ) {
		
	if(mediat>d) {
		quantAlunosAcima++;
		//break;	
	}
	
	}
	System.out.printf("a media dos alunos: %.1f %n ",mediat);
	System.out.println("a quantidade de alunos com nota acima da media de todos: "+quantAlunosAcima);
	
	}
}
