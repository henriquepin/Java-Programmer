package cap10.lab;

public class Geladeira implements Eletrodomestico {
	double temperatura;
	
	public void ligar(){
		System.out.println("Ligando a geladeira");
	}
	
	public void descongelar(){
		System.out.println("Descongelando a geladeira");
	}
	
	public void desligar(){
		System.out.println("Desligando a geladeira");
	}

}
