package carro;

public class Carro {
	private String modelo;
	private String potMotor;
	private String cor;
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public void setPotMotor(String potMotor){
		this.potMotor = potMotor;
	}
	
	public String getPotMotor(){
		return potMotor;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public String getCor(){
		return cor;
	}
	
	public void mostrarDados(){
		System.out.println("Nome: " + getModelo());
		System.out.println("Raça: " + getPotMotor());
		System.out.println("Idade: " + getCor());

	}
}

