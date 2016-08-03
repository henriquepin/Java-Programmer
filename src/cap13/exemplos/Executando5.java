package cap13.exemplos;

public class Executando5 {
	public static void main(String[] args) {
		
		ExemploFuncional1 funcao = (n, i, s) -> System.out.println(
				"Funcionário " + n +  " salário " + s);
		
		funcao.exibeDados("Maria", 25, 4500.00);
	}
}
