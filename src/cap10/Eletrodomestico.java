package cap10;

public interface Eletrodomestico {
	
	void ligar();
	
	void desligar();
	
/* à partir da versão 8.0 são permitidos métodos concretos em interfaces, desde que: 
* 1) sejam estáticos; ou
* 2) sejam default;
*/	
	
	static void desligarTudo(Eletrodomestico... eletroArray) {
		for(Eletrodomestico eletrodomestico: eletroArray) {
			eletrodomestico.desligar();
		}
	}
	
	default void acionarTimer(int tempoEmMinutos){
		System.out.println("Acionando o timer para " + tempoEmMinutos + " minutos");
	}
	
	
}
