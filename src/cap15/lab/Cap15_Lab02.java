package cap15.lab;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;


public class Cap15_Lab02 {

	final static String PASTA_ORIGEM = "C:\\USERS\\DI3508\\WORKSPACE\\DOCUMENTOS2";	
	final static String PASTA_BACKUP = "C:\\USERS\\DI3508\\WORKSPACE\\BACKUP";
	
	public static void main(String[] args) {
		
		Path origem = Paths.get(PASTA_ORIGEM);		
		Path backup = Paths.get(PASTA_BACKUP);
				
		try{
			if(Files.exists(backup)){
				System.out.println("Documento " + backup.getFileName() + " já existe");
			}else{
				Files.createDirectory(backup);
				System.out.println("Documento " + backup.getFileName() + " criado com sucesso");				
			}
			
			Stream <Path> streamOrigem = Files.list(origem);
			
			streamOrigem.forEach(p -> {
				try{
					Files.copy(p, backup.resolve(p.getFileName()));			
				}catch(IOException e){
				e.printStackTrace();
				}
			});
			
		}catch(IOException e){
			e.printStackTrace();
		}		
	}	
}
