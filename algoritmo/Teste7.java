package algoritmo;

import java.util.ArrayList;
import java.util.List;

public class Teste7 {
	
	public static void main(String[] args) {
		
		
		List<String> banco = new ArrayList<String>();
		List<String> conciliacao = new ArrayList<>();
		List<String> serasa = new ArrayList<String>();
		String banco1= "atrasado";
		String banco2 = "atrasado";
		String banco3 = "pago";
		
		String serasa1="atrasado";
		String serasa2="atrasado";
		String serasa3="atrasado";
	
		serasa.add(serasa1);
		serasa.add(serasa2);
		serasa.add(serasa3);
		
		banco.add(banco1);
		banco.add(banco2);
		banco.add(banco3);
		
		for(String b: banco) {
		for(String c: serasa) {
			if(!(b.equals(c))) {
				conciliacao.add(b);
				
				}	
			break;
		}
		
		}
		System.out.println(conciliacao);
		
		}
	
	
		
	}


