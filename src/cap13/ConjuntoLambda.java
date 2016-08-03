
/* Crie a classe ConjuntoLambdas
 * Baseando-se na interface OperacaoAritmetica,
 * crie o array calculos que guarde expressões lambdas
 * para somar, dividir, multiplicar e subtrair.
 * Usando o for aprimorado, mostre os resultados na tela.
 */

/*

A saída deste código deverá ser:
27.0
8.0
72.0
21.0
*/

package cap13;

public class ConjuntoLambda {

	public static void main(String[] args) {
		
		OperacaoAritmetica calculos[] = { (x,y) -> x + y, 
										  (x,y) -> x - y, 
										  (x,y) -> x * y, 
										  (x,y) -> x/y };
				
//		OperacaoAritmetica calculos[] = new OperacaoAritmetica[4];
//		
//		calculos[0] = (x,y) -> x + y;
//		calculos[1] = (x,y) -> x - y;
//		calculos[2] = (x,y) -> x * y;
//		calculos[3] = (x,y) -> x/y;
	
		for(OperacaoAritmetica operacaoAritmetica: calculos){
			System.out.println(operacaoAritmetica.execute(24, 3));
		}
	}
}

