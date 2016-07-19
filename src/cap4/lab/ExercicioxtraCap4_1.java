/*
 * Baseando-se na tabela a seguir, desenvolver um c�digo que retorne o valor do
 * imposto de renda de um sal�rio de R$ 4.000,00.
 * 
 * Faixa salarial.................Al�quota................Parcela a deduzir
 * 
 * At� 1.903,98 	             - 			- 
 * De 1.903,99 at� 2.826,65........ 7,5% ..................142,80
 * De 2.826,66 at� 3.751,05........  15% ..................354,80 
 * De 3.751,06 at� 4.664,68........  22% ..................636,13 
 * Acima de 4.664,68 .................27,5% ..................869,36
 */


package cap4.lab;

public class ExercicioxtraCap4_1 {
	public static void main(String[] args) {
		double salario = 4000;
		double ir;
		
		if(salario >= 1903.99 && salario <= 2826.65){
			ir = (salario*0.075) - 142.80;
			System.out.println(ir);
		} 
		else if(salario >= 2826.66 && salario <= 3751.05){
			ir = (salario*0.15) - 354.80;
			System.out.println(ir);
		}
		else if(salario >= 3751.06 && salario <= 4664.68){
			ir = (salario*0.22) - 636.13;
			System.out.println(ir);
		}
		else if(salario > 4664.68){
			ir = (salario*0.275) - 869.36;
			System.out.println(ir);
		} else {
			System.out.println("ir = 0");
		}
	}
}
