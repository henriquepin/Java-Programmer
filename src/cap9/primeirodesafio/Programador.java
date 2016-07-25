package cap9.primeirodesafio;

public class Programador extends Funcionario {
	String linguagem;
	
	
	public void reajustarSalario(){
		salario += 300;
	}
	
	public void setLinguagem(String linguagem){
		this.linguagem = linguagem;
	}
	
	public String getLinguagem(){
		return linguagem;
	}
	
	public void imprimir(){
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Salário: " + getSalario());
		System.out.println("Linguagem: " + getLinguagem());
	}

	
}
