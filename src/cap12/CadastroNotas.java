package cap12;

public class CadastroNotas {
	public static void main(String[] args) {
		
		try{
			Nota nota = new Nota("Maria", 11);
			
		}catch(NotainvalidaException e){
			System.out.println("Nota inv�lida =  " + e.getMessage());
			e.printStackTrace();
		}
	}
		
}

