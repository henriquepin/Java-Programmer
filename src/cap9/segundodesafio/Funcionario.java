package cap9.segundodesafio;

public class Funcionario {
	private String nome;
	private int idade;
	private double salario;
	
	public void setDados(String nome, double salario, int idade){
		setNome(nome);
		setIdade(idade);
		setSalario(salario);
	}
	
	
	public void reajustarSalario(){
		salario += 100;
	}
		
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public double getSalario(){
		return salario;
	}
	
	public void imprimir(){
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Salário: " + getSalario());
	}
	
}
	
