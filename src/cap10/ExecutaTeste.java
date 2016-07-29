package cap10;


public class ExecutaTeste {
	public static void main(String[] args) {
		Eletrodomestico geladeira = new Geladeira();
		geladeira.ligar();
		geladeira.acionarTimer(60);
		((Geladeira) geladeira ).descongelar(); // casting de objetos
		
//		geladeira.desligar();
		
		Eletrodomestico tv = new Televisao();
		tv.ligar();
		tv.acionarTimer(30);
		((Televisao)tv).trocarCanal();
//		tv.desligar();
		
		Eletrodomestico microondas = new Microondas() ;
		microondas.ligar();
		microondas.acionarTimer(3);
		((Microondas)microondas).aquecer();
//		microondas.desligar();
		
		Eletrodomestico.desligarTudo(new Geladeira(), new Televisao(), new Microondas());
	}
}



