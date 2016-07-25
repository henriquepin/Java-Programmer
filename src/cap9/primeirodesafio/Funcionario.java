package cap9.primeirodesafio;

public class Funcionario {
	String nome;
	int idade;
	double salario;
	
	void reajustarSalario(){
		salario += 100;
	}
		
	void setNome(String nome){
		this.nome = nome;
	}
	
	String getNome(){
		return nome;
	}
	
	void setIdade(int idade){
		this.idade = idade;
	}
	
	int getIdade(){
		return idade;
	}
	
	void setSalario(double salario){
		this.salario = salario;
	}
	
	double getSalario(){
		return salario;
	}
	
	void imprimir(){
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Salário: " + getSalario());
	}
	
}
	
