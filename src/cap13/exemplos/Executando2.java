package cap13.exemplos;

public class Executando2 {
	public static void main(String[] args) {
		
		ExemploFuncional2 funcao = () -> System.out.println("olá Mundo");
		
		funcao.exibeDados();
	}
}
