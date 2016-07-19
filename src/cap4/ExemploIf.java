package cap4;

public class ExemploIf {
	public static void main(String args[]){
		int x = 10;
		
		if(x < 15){ // chaves nao obrigatorias (escopo) qdo ha apenas uma instrucao dentro do bloco de comando
					// porem, considerado boas praticas sua utilizacao mesmo nesses casos
			System.out.println("x é menor que 15");
			System.out.println("o valor de x é " + x);
		}
	}
}
