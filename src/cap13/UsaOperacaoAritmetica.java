package cap13;

public class UsaOperacaoAritmetica {
	public static void main(String[] args) {
		OperacaoAritmetica soma = new Soma();
		System.out.println(soma.execute(20, 2));
		
		OperacaoAritmetica divisao = new Divisao();
		System.out.println(divisao.execute(20, 2));
		
		OperacaoAritmetica multiplicacao = new Multiplicacao();
		System.out.println(multiplicacao.execute(20, 2));
		
		OperacaoAritmetica subtracao = new Subtracao();
		System.out.println(subtracao.execute(20, 2));
		
		
		System.out.println("--------------Usando Lambdas----------------");
		
		//Implementa a operação a ser realizada através de uma expressão Lambda;
		OperacaoAritmetica operacao = (x,y) -> x + y;//operacao somar (classe soma)
		System.out.println(operacao.execute(40, 2));
		
		operacao = (x,y) -> x - y;
		System.out.println(operacao.execute(40, 2));//operacao subtracao (classe subtracao)
		
		operacao = (x,y) -> x * y;
		System.out.println(operacao.execute(40, 2));//operacao multiplicacao (classe multiplicacao)
		
		operacao = (x,y) -> x/y;
		System.out.println(operacao.execute(40, 2));//operacao divisao (classe divisao)
		
	}
}
