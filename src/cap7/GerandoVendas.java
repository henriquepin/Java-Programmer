package cap7;

public class GerandoVendas {
	public static void main(String[] args) {

//instanciando 
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();

//setando dados para v1		
		v1.setNome("João");
		v1.setPremioIndividual(200);
		v1.setPremioEquipe(500);

//setando dados para v2
		v2.setNome("Maria");

//mostrando dados para v1		
		v1.mostrarDados();
		
//mostrando dados para v2		
		v2.mostrarDados();
		
	}
}
