package cap9.segundodesafio;

public class Chefe extends Funcionario {
	private String celular;
	
	public void setDados(String nome, double salario, int idade, String celuar){
		setDados(nome, salario, idade);//sobrecarga
		setCelular(celular);
	}

	
	public void setCelular(String celular){
		this.celular = celular;
	}
	
	public String getCelular(){
		return celular;
	}
	
	public void imprimir(){
		super.imprimir();
//		System.out.println("Nome: " + getNome());
//		System.out.println("Idade: " + getIdade());
//		System.out.println("Sal�rio: " + getSalario());
		System.out.println("Linguagem: " + getCelular());
	}

	
}
