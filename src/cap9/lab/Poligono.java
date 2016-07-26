package cap9.lab;

abstract public class Poligono {
	double area;
	
	
//	public Poligono(double area){
//		setArea(area);
//	}
	
	abstract public void calcularArea();
	
	abstract public void imprimir();
	
	public void setArea(double area){
		this.area = area;
	}
	
	public double getArea(){
		return area;
	}
	
}
