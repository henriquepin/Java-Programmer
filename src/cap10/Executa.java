package cap10;

public class Executa {
	public static void main(String[] args) {
		
		Geladeira g = new Geladeira();
		
		Televisao t = new Televisao();
		
		Microondas m = new Microondas();
		
		g.ligar();
		g.descongelar();
		g.desligar();
		
		System.out.println("---------------------");
		
		t.ligar();
		t.trocarCanal();
		t.desligar();
		
		System.out.println("---------------------");
		
		m.ligar();
		m.assar();
		m.aquecer();
		m.desligar();
		
	}
}
