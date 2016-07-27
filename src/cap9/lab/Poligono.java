package cap9.lab;

abstract public class Poligono {
	double area;
	
		
	public abstract void calcularArea();
	
	public abstract void imprimir();
	
	public void setArea(double area){
		this.area = area;
	}
	
	public double getArea(){
		return area;
	}
	
}
