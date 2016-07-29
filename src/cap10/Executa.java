package cap10;

public class Executa {
	public static void main(String[] args) {
		
		Eletrodomestico geladeira = new Geladeira();
		
		Eletrodomestico televisao = new Televisao();
		
		Eletrodomestico microondas = new Microondas();
		
		geladeira.ligar();		
		geladeira.acionarTimer(60);
		((Geladeira)geladeira).descongelar();//casting de objetos, no caso geladeira	
		geladeira.desligar();
		
		System.out.println("---------------------");
		
		televisao.ligar();
		televisao.acionarTimer(60);
		((Televisao)televisao).trocarCanal();
		televisao.desligar();
		
		System.out.println("---------------------");
		
		microondas.ligar();
		microondas.acionarTimer(10);
		((Microondas)microondas).aquecer();
		((Microondas)microondas).assar();
		microondas.desligar();
		System.out.println("------------------");
		
		
		Eletrodomestico.desligarTudo(geladeira, televisao, microondas);
		
		System.out.println("------------------");
		
		Eletrodomestico.desligarTudo(new Geladeira(), new Televisao(), new Microondas());//outra maneira de chamar o metodo desligarTudo
	}
}
