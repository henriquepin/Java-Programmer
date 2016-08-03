package cap13.exemplos;

import cap13.OperacaoAritmetica;

public class Executando9 {
	public static void main(String[] args) {
		
		/* Cria uma instancia da classe que contem o metodo desejado. */
		Produto produto = new Produto("Sapato social", 42);
		
		/*utiliza o metodo aumentarPreco() como referencia para nossa funcao. */
		OperacaoAritmetica funcao = produto::aumentarPreco;
		
		/* Executa a funcao e exibe o resultado. */
		System.out.println("Valor final: " + funcao.execute(65.5, 8.5));
	}
}
