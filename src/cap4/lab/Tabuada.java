package cap4.lab;

public class Tabuada {

	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++){
			System.out.println("\nTabuada do " + x);
			for (int y = 1; y <= 10; y++)
				System.out.println(x + " * " + y + " = " + x * y);
		}
	}
}
