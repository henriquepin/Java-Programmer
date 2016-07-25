package cap9.primeirodesafio;

public class Chefe extends Funcionario {
	String celular;
	
	public void setCelular(String celular){
		this.celular = celular;
	}
	
	public String getCelular(){
		return celular;
	}
	
	public void imprimir(){
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Salário: " + getSalario());
		System.out.println("Linguagem: " + getCelular());
	}

	
}
