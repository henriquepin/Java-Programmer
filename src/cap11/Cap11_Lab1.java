package cap11;

public class Cap11_Lab1 {
	
	 static int maiorNumero(int numeros[]){
		 int maior = 0;
		 
		 for(int i = 0; i < numeros.length; i++){
			 if(numeros[i] > maior)
				 maior = numeros[i];
		 }
		 
		 return maior;
	}
			
	 public static void main(String[] args) {
		
		 int numeros [] = {100, 200, 300, 500, 800, 5};
		 
		 int maior = maiorNumero(numeros);
		
		 System.out.println("O maior número da array é: " + maior);
	}	

}
