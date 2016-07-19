package cap4;

public class ExemploBreak {
	public static void main(String[] args) {
		
		for(int i = 1; i < 11; ++i){
			if(i==5)
				break; // interrompe o laço
			System.out.println("O valor de i é: " + i);
		}
		System.out.println("próxima linha de código após o loop...");
	}
}
