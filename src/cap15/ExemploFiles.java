package cap15;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class ExemploFiles {

	public static void main(String[] args) {
		
		try{
			Path arquivo = Paths.get("somNaCaixa\\poema.txt");
			Path novaPasta = Paths.get("somNaCaixa\\textos\\rascunhos\\vazio");
			Path pasta = Paths.get("C:\\Meus Documentos\\Mp3");
			
			if(!Files.exists(arquivo)){
				System.out.println("O item n�o existe");
			} else if(Files.isDirectory(arquivo)){
				System.out.println("O item � um diret�rio");
			}else if(Files.isRegularFile(arquivo)) {
				System.out.println("O item � um arquivo.");
			}
			
			/*Exibe */
			System.out.println(Files.size(arquivo));
			
			/*Cria o diret�rio rascunho */
			Files.createDirectories(novaPasta);
			
			/* Exibe o conte�do do diret�rio Mp3 */
			Files.list(pasta).forEach(f -> System.out.println(f.getFileName()));
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
}
	

