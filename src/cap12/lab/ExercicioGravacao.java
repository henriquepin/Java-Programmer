package cap12.lab;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExercicioGravacao {
	public static void main(String[] args) {
		
		try{
			Scanner txt = new Scanner(System.in);
			
			System.out.println("Digite uma frase qualquer");
			String texto = txt.nextLine();
			
			PrintWriter writer = new PrintWriter("C:\\doc1.txt");
			writer.println(texto);
			writer.close();			
		}catch(FileNotFoundException e){
		System.out.println("Falha ao gravar arquivo");
			e.printStackTrace();
		}
		
	}
}
