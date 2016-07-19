/*
 * Desenvolva um código que retorne o valor a pagar der uma compra, de acordo
 * com o seguinte cenário:
 * 
 *  Faixa............................ Desconto (em %)
 *  0 a 1000 ........................     0 %
 *  1001 a 3000 .....................     5 %
 *  Acima de 3000 ...................    10 %
 * 
*/
package cap3.lab;

public class labCap3 {
	public static void main(String[] args) {
		double valor1 = 2000;
		double valor2 = 2000;
		double vlcompra = valor1 + valor2;

//		System.out.println((valor1 + valor2 >= 0 && valor1 + valor2 <=1000) ? vlcompra : (valor1 + valor2 >= 1001 && valor1 + valor2 <= 300) ? (vlcompra*0.95) : (valor1 + valor2) > 3000 ? (vlcompra*0.9) : "");
		System.out.println(vlcompra >= 0 && vlcompra <=1000 ? vlcompra : (vlcompra >= 1001 && vlcompra <= 3000) ? (vlcompra*0.95) : (vlcompra*0.9));
	}
}
