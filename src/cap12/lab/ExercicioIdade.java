package cap12.lab;

import java.util.Scanner;

public class ExercicioIdade {
	public static void main(String[] args) {
		
		try{
		Scanner anoNasc = new Scanner (System.in);
		int resultado;
		
		System.out.println("Digite o ano de seu nascimento");
		String idade = anoNasc.nextLine();
		
		int idadeUsuario = Integer.parseInt(idade);
		
		resultado = (2014 - idadeUsuario);
		
		System.out.println("Sua idade é: " + resultado);
	}catch(NumberFormatException e){
		System.out.println("Valor digitado inválido");
		e.printStackTrace();
	}
		
	}
}
