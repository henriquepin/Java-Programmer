package cap2;

public class Escopo {
	public static void main(String[] args) {
		
		String nome = "Ana";
		{
			int idade = 10;
			System.out.println("Nome:" +nome);
			System.out.println("Idade:" +idade);
			
		}// fim de um escopo interno
		System.out.println("Nome:" +nome);
//		System.out.println("Idade:" +idade); // a variavel idade acusa erro, pois ela esta dentro do escopo interno (n�o pode ser "chamada" fora dele), e n�o do escopo do metodo como a variavel nome
		
	}//fim do escopo do m�todo
}//fim do escopo da classe
