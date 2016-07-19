//Crie a classe Vendedor, com os atributos privados:
//	nome
//	premioEquipe
//	premioIndividual
//
//Obs.: os atributos premioEquipe e premioIndividual devem
//ser inicialializados com os valores 100 e 200, respectivamente.
//
//Métodos:
//	getters e setters
//	mostrarDados
//
//Obs: os métodos setPremioIndividual e setPremioEquipe devem
//incrementar os valores recebidos aos respectivos atributos.
//
//-------------------------------------------------------------
//
//Crie a classe GerandoVendas (com o método main)
//
//Crie duas instâncias da classe Vendedor: v1 e v2
//* v1 terá as seguintes atribuições: 
//  Nome: João
//  Prêmio individual: 200
//  Prêmio equipe: 500
//
//* v2 terá as seguintes atribuições:
//  Nome: Maria
//  Prêmio individual: não atribua nada
//  Prêmio equipe: não atribua nada


package cap7;

public class Vendedor {
	private String nome; //variavel de instancia
	static double premioEquipe = 100; //variavel de classe (recebeu "static")
	/*
	 * variáveis marcadas como static são variaveis de classe
	 * não vão depender de instancia para existirem
	 * ou seja, na classe "GerandoVendas" não precisa ser invocada por meio
	 * do objeto e sem pelo nome da classe
	 * 
	 */
	
	private double premioIndividual = 200; //varaivel de instancia
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setPremioEquipe(double premioEquipe){
		this.premioEquipe += premioEquipe;
	}
	
	public double getPremioEquipe(){
		return premioEquipe;
	}
	
	public void setPremioIndividual(double PremioIndividual){
		this.premioIndividual += premioIndividual;
	}
	
	public double getPremioIndividual(){
		return premioIndividual;
	}
	
	public void mostrarDados(){
		System.out.println("Nome: " + getNome());
		System.out.println("Premio Individual: " + getPremioIndividual());
		System.out.println("Premio Equipe: " + getPremioEquipe());
		System.out.println("---------------------");
	}
}
