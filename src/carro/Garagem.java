package carro;

public class Garagem {
	
	Carro carroPasseio = new Carro(); //como esta no escopo de uma classe, é chamado de atributo
	Carro carroUtilitario = new Carro();
	
	public static void main(String[] args) {
		Garagem g = new Garagem();
		
		g.carroPasseio.setModelo("VW Cross up!");
		g.carroPasseio.setPotMotor("1.0 tsi");
		g.carroPasseio.setCor("Branco");
		
		g.carroUtilitario.setModelo("VW Gol");
		g.carroUtilitario.setPotMotor("1.8");
		g.carroUtilitario.setCor("Preto");
		
		System.out.println("Carro Passeio:");
		g.carroPasseio.mostrarDados();
		
		System.out.println("-----------------");
		
		System.out.println("Carro Utilitário:");
		g.carroUtilitario.mostrarDados();
	}
}
