/*Usando a instrução for, desenvolva uma rotina
que mostre na tela as tabuadas do 1 ao 10.
*/

package cap4.lab;

public class ExercicioExtraCap4_2 {
	public static void main(String[] args) {
		int x;
		int y;
		
		for(x = 1; x <= 10; x++){
			System.out.println("\nTabuada do " + x);
			for(y = 1; y <= 10; y++)
				System.out.println(x + " * " + y + " = " + x * y);
		}
	}
}
