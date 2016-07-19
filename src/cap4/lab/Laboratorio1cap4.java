package cap4.lab;

public class Laboratorio1cap4 {
	public static void main(String[] args) {
		int numero = 10; //dividendo
		int divisoes = 0; //numero possivel de divisoes
		
		for(int divisor = 1; divisor <= numero; divisor++ ){
			if(numero % divisor == 0){
				divisoes++;
			}
		}
		
		if(divisoes <= 2){
			System.out.println("O número é primo");
		}
		else{
			System.out.println("O número não é primo");
		}
	}
}
