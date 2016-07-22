package cap11;

public class UsaGato {
	public static void main(String[] args) {
		
		Gato g1 = new Gato();
		
		g1.setNome("Babo");
		g1.setIdade(10);
		
//		g1.mostrarDados();
		
		System.out.println(g1); // aparece a referencia do objeto
		
	}
}
