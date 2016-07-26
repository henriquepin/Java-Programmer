package cap9.lab;

public class Quadrado extends Poligono {
	double lado;
	
	public Quadrado(double lado){
//		super(area);
		setLado(lado);
	}
	
	public void setLado(double lado){
		this.lado = lado;
	}
	
	public double getLado(){
		return lado;
	}
	
	public void calcularArea(){
		setArea(getLado() * getLado());
//		double area = (getLado() * getLado());
//		setArea(area);
	}
	
	public void imprimir(){
		System.out.println("lado = " + getLado());
		System.out.println("área = " + getArea());
	}
	
}
