package cap6;

public class UsaCachorro {
	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro (); //instanciando a classe cachorro
		Cachorro c2 = new Cachorro ();
		
		
//		c1.nome = "Totó"; //acesso restrito
//		c1.raca = "Vira"; // atributo está encapsulado na classe cachorro
//		c1.idade = 2;
		
//		c2.nome = "Fifi"; 
//		c2.raca = "Poodle";
//		c2.idade = 3;
		
//		System.out.println("c1 - " + c1.nome + " - " + c1.raca +" - " + c1.idade);
//		System.out.println("c2 - " + c2.nome + " - " + c2.raca +" - " + c2.idade);
		
		
		c1.setNome("Toto");
		c1.setRaca("Vira");
		c1.setIdade(10);
		
		c1.mostrarDados();
		
	}
}
