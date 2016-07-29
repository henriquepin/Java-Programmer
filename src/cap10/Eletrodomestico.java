package cap10;

public interface Eletrodomestico {
	
	void ligar();
	
	void desligar();
	
/* � partir da vers�o 8.0 s�o permitidos m�todos concretos em interfaces, desde que: 
* 1) sejam est�ticos; ou
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
