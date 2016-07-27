package cap9.ritaresposta;

public class Triangulo extends Poligono {
	private double base;
	private double altura;

	
	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getAltura() {
		return altura;
	}

	void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		return "Triangulo [altura=" + altura + ", base=" + base + ", �rea: " + getArea()+ "]";
	}

	public Triangulo(double base, double altura) {
//		setBase(base);
		setAltura(altura);
	}

	public  void calcularArea() {
		double resultado = (base * altura) / 2;
		setArea((base * altura) / 2);
	}
	

}
