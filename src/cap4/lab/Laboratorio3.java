package cap4.lab;

public class Laboratorio3 {
	public static void main(String[] args) {
		
		for(int ano = 1930; ano <= 2016; ano += 4){
			
			if(ano == 1942 || ano == 1946){
//				System.out.println("II Guerra Mundial"); para imprimir nesses dois anos a frase "II Guerra Mundial"
				
				continue;
			}
			System.out.println("Copa do mundo do ano de " + ano);
		}
}
}
