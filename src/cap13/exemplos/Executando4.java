package cap13.exemplos;

public class Executando4 {
	public static void main(String[] args) {
		
		ExemploFuncional1 funcao = (n, i, s) -> {
			String nomeMaiusculo = n.toUpperCase();
			if(i < 18){
				System.out.println("Funcion�rio n�o pode ser menor de idade");	
			} else{
				System.out.println("Funcion�rio: " + nomeMaiusculo + " recebe sal�rio " + s);
			}
		
		};
		
		funcao.exibeDados("Maria", 28, 15550.00);
	}
		
}



