package cap11;

public class ExemploSimplesCriacaoArray {
	public static void main(String[] args) {
		
		int numeros [] = new int[3]; //maneira classica de criar arrays
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		
		
//		int valores [] = {100, 200, 300}; //maneira facilitada "pratica" de criar arrays	
		
		for (int i : numeros){
			System.out.println(i);
		}
	}
}
