package cap4.lab;

public class Cap4Lab1 {
	public static void main(String args[]) {
		int numero = 11; //dividendo
		int divisoes = 0; // n�mero poss�vel de divis�es 
		for (int divisor = 1; divisor <= numero; divisor++) {
			if (numero % divisor == 0){
				divisoes++;
				System.out.println(numero + " � divis�vel por " + divisor);
			}
		}
		if (divisoes <= 2) {
			System.out.println("\n" + numero + " � um n�mero primo");
			System.out.println("N�mero de divis�es poss�veis: " + divisoes);
		} else {
			System.out.println("\n" + numero + " n�o � um n�mero primo");
			System.out.println("N�mero de divis�es poss�veis: " + divisoes);
		}
	}
}

