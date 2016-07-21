package cap11;

public class Pessoa {
	String nome;
	double altura;
	double peso;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAltura(){
		return altura;
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public double getPeso(){
		return peso;
	}
	
	public void mostrarDados(){
		System.out.println("Nome: " + getNome());
		System.out.println("Altura: " + getAltura());
		System.out.println("Peso: " + getPeso());
	}
}
