package cap7;

public class GerandoVendas2 {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();
		
//		Vendedor.premioEquipe = 2000;

		v1.setNome("João");
		v2.setNome("Maria");

		v1.mostrarDados();
		v2.mostrarDados();

		System.out.println("Atribuindo valores aos prêmios de v1(João)");

		v1.setPremioIndividual(200);
		v1.setPremioEquipe(500);
		v1.mostrarDados();

		System.out.println("Mostrando os valores de v2 (Maria) sem ter feito atribuições");

		v2.mostrarDados();

		System.out.println("Criando v3 (Cida) testando a variável de classe");

		Vendedor v3 = new Vendedor();
		v3.setNome("Cida");
		v3.setPremioEquipe(-300);
		v3.setPremioIndividual(800);
		v3.mostrarDados();

		System.out.println("Mostrando novamente os três objetos");
		
		v1.mostrarDados();
		v2.mostrarDados();
		v3.mostrarDados();

	}

}
