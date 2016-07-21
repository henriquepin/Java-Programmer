package cap11;

public class ExemploCriacaoArray {
	public static void main(String[] args) {
	
		int [] codigos = new int[4];
		
		codigos[0] = 1;
		codigos[1] = 2;
		codigos[2] = 3;
		codigos[3] = 4;
		
		String [] nomes = new String[5];
		
		nomes[0] = "Ana";
		nomes[1] = "Bete";
		nomes[2] = "Cida";
		nomes[3] = "João";
		nomes[4] = "Pedro";
		
		for(int i = 0; i < nomes.length; i++){
			System.out.print(nomes[i] + " ");
		}
		
		for(int n = 0; n < codigos.length; n++){
			System.out.print(codigos[n] + " ");
		}
		
	}
}
