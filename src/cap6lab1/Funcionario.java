package cap6lab1;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private String cargo;
	private double salario;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome(){
		return sobrenome;
	}
	
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	
	public String getCargo(){
		return cargo;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public double getSalario(){
		return salario;
	}
	
	public void mostrarDados(){
	System.out.println("Nome: " + getNome());
	System.out.println("Sobrenome: " + getSobrenome());
	System.out.println("Cargo: " + getCargo());
	System.out.println("Salário: " + getSalario());
	}
	
}
