package cap9.lab;

public class Triangulo extends Poligono {
	double altura;
	double base;
	
	public Triangulo(double altura, double base){
//		super(area);
		setAltura(altura);
		setBase(base);
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAltura(){
		return altura;
	}
	
	public void setBase(double base){
		this.base = base;
	}
	
	public double getBase(){
		return base;
	}
	
	public void calcularArea(){
		setArea(getBase() * getAltura()/2);
//		double area = (getBase() * getAltura())/2;
//		setArea(area);
	}
	
	public void imprimir(){
		System.out.println("altura = " + getAltura());
		System.out.println("base = " + getBase());
		System.out.println("área = " + getArea());
	}
}
