package cap10;

public class Televisao implements Eletrodomestico {
	int canal;
	int volume;
	
	
	public void ligar(){
		System.out.println("Ligando a Televisão");
	}

	public void trocarCanal(){
		System.out.println("Trocando de canal");
	}
	
	public void desligar(){
		System.out.println("Desligando a Televisão");
	}

}
