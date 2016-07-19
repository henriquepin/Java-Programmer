package cap7;

public class PrimeiroArray {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		
		
		int [] numeros = new int[3];
		
		numeros[0] = 100;
		numeros[1] = 200;
		numeros[2] = 300;
		
//		System.out.println(numeros[0]);
//		System.out.println(numeros[1]);
//		System.out.println(numeros[2]);
		
		
		String [] palavras = new String[4]; // "declarando um Array"
		
		palavras[0] = "Não";
		palavras[1] = "estou";
		palavras[2] = "com";
		palavras[3] = "sono";
		
		
//		System.out.println(palavras[0]);
//		System.out.println(palavras[1]);
//		System.out.println(palavras[2]);
//		System.out.println(palavras[3]);
		
		
		for(int i = 0; i < palavras.length; i++){
			System.out.print(palavras[i] + " ");
		}
	}
	
}
