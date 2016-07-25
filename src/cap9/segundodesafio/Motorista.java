package cap9.segundodesafio;

public class Motorista extends Funcionario {
	private int cnh;
	
	public void setDados(String nome, double salario, int idade, int cnh){
		setDados(nome, salario, idade);
		setCnh(cnh);
	}

	
	public void reajustarSalario(){
		setSalario(getSalario() + 200);
	}
	
	public void setCnh(int cnh){
		this.cnh = cnh;
	}
	
	public int getCnh(){
		return cnh;
	}
	
	public void imprimir(){
		super.imprimir();
//		System.out.println("Nome: " + getNome());
//		System.out.println("Idade: " + getIdade());
//		System.out.println("Salário: " + getSalario());
		System.out.println("Linguagem: " + getCnh());
	}


}
