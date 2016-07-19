package cap7;

public class ExemploSobrecarga {
	public static void main(String args[]) {
		Sobrecarga sob = new Sobrecarga();
		sob.mostrar("Ernesto");
		sob.mostrar();
		sob.mostrar(38);
		sob.mostrar("Henrique", "Pin");
		sob.mostrar(28, "Henrique");
		sob.mostrar("Henrique", 28);
	}
}
