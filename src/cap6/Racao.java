package cap6;

public class Racao {
	String tipo;
	String marca;
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void mostrarDados(){
		System.out.println("Tipo ração: " + getTipo());
		System.out.println("Marca ração: " + getMarca());
		
	}
	
	
	
	
	
}
