package cap9.ritaresposta;

public abstract class Poligono {
	private double area;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	void imprimir() {
		System.out.println(this);
	}

	public abstract void calcularArea();

}
