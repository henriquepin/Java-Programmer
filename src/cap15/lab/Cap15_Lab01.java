package cap15.lab;

import java.io.*;

public class Cap15_Lab01 {
	
	public static void main(String[] args) {
		
		escrever("Capitulo 15\nLaboratorio 1");
		
		ler();
		
	}
		
	static void escrever(String texto){
		
		try{
			FileOutputStream arquivo = new FileOutputStream("Cap15_Lab01.txt");
			DataOutputStream dados = new DataOutputStream(arquivo);
			dados.writeChars(texto);

		}catch(IOException e){
			System.out.println(e.getMessage());			
		}
			
	}
	
	static void ler(){
		
		try{
			FileInputStream arquivo = new FileInputStream("Cap15_Lab01.txt");
			DataInputStream dados = new DataInputStream(arquivo);
			while(dados.available() > 0){
				char c = dados.readChar();
				System.out.print(c);
			}
		}catch(IOException e){
			System.out.println(e.getMessage());			
		}

		
	}
	
}
	
	

