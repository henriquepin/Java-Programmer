package cap4;

public class ExemploBreak {
	public static void main(String[] args) {
		
		for(int i = 1; i < 11; ++i){
			if(i==5)
				break; // interrompe o la�o
			System.out.println("O valor de i �: " + i);
		}
		System.out.println("pr�xima linha de c�digo ap�s o loop...");
	}
}
