package cap13.exemplos;

public class Executando4 {
	public static void main(String[] args) {
		
		ExemploFuncional1 funcao = (n, i, s) -> {
			String nomeMaiusculo = n.toUpperCase();
			if(i < 18){
				System.out.println("Funcionário não pode ser menor de idade");	
			} else{
				System.out.println("Funcionário: " + nomeMaiusculo + " recebe salário " + s);
			}
		
		};
		
		funcao.exibeDados("Maria", 28, 15550.00);
	}
		
}



