package cap9.primeirodesafio;

public class Motorista extends Funcionario {
	int cnh;
	
	public void reajustarSalario(){
		salario += 200;
	}
	
	public void setCnh(int cnh){
		this.cnh = cnh;
	}
	
	public int getCnh(){
		return cnh;
	}
	
	public void imprimir(){
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Salário: " + getSalario());
		System.out.println("Linguagem: " + getCnh());
	}


}
