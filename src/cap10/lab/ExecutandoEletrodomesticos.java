package cap10.lab;

public class ExecutandoEletrodomesticos {
	public static void main(String[] args) {
		Eletrodomestico[] aparelhos = { new Geladeira(), new Televisao(), new Microondas() };

		executarAparelhos(aparelhos); // fa�a este m�todo funcionar
	}
	
	static void executarAparelhos(Eletrodomestico[] aparelhos){
		
		for(Eletrodomestico eletrodomestico: aparelhos) {
			if(eletrodomestico instanceof Geladeira){//metodo instanceof esta "perguntando" se eletrodomestico � um objeto "Geladeira"
				eletrodomestico.ligar();
				((Geladeira) eletrodomestico).descongelar();
			}
			else if(eletrodomestico instanceof Televisao){
				eletrodomestico.ligar();
				((Televisao) eletrodomestico).trocarCanal();
			}
			else{
				eletrodomestico.ligar();
				((Microondas)eletrodomestico).aquecer();		
			}		
		}
	}
		
}

//static void executarAparelhos(Eletrodomestico[] aparelhos){

//for(int i = 0; i < aparelhos.length; i++) {
//	if(aparelhos[i] instanceof Geladeira){  //metodo instanceof esta "perguntando" se eletrodomestico � um objeto "Geladeira"
//		aparelhos[i].ligar();
//		((Geladeira) aparelhos[i]).descongelar();
//	}
//	else if(aparelhos[i] instanceof Televisao){
//		aparelhos[i].ligar();
//		((Televisao) aparelhos[i]).trocarCanal();
//	}
//	else{
//		aparelhos[i].ligar();
//		((Microondas)aparelhos[i]).aquecer();		
//	}		
//}
//}


/*
 * Nesta mesma classe, implemente o m�todo void executar(aparelhos)
 * 
 * A sa�da dever� ser:
 * 
 * Ligando a geladeira...
 * Descongelando...
 * ---------------------------------------------------
 * Ligando TV.
 * Trocando canal...
 * ---------------------------------------------------
 * Ligando Microondas.
 * Aquecendo...
* ---------------------------------------------------
 */

