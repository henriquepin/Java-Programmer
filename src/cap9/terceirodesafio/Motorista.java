package cap9.terceirodesafio;

public class Motorista extends Funcionario {
	private int cnh;
	
	public Motorista(String nome, double salario, int idade, int cnh){
		super(nome, salario, idade);
		setCnh(cnh);
	}
	
//	public void setDados(String nome, double salario, int idade, int cnh){
//		setDados(nome, salario, idade);
//		setCnh(cnh);
//	}

	
	public void reajustarSalario(){
		setSalario(getSalario() + 200);//utilizei os metodos "set" e "get", pois a variavel salario esta privada na classe Funcionario
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
