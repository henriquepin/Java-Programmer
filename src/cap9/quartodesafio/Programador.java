package cap9.quartodesafio;

public class Programador extends Funcionario {
	private String linguagem;
	
	public Programador(String nome, double salario, int idade, String linguagem){
		super(nome, salario, idade);
		setLinguagem(linguagem);
	}
	
//	public void setDados(String nome, double salario, int idade, String linguagem){
//		setDados(nome, salario, idade);//sobrecarga
//		setLinguagem(linguagem);
//	}

	
	public void reajustarSalario(){
		setSalario(getSalario() + 300);//utilizei os metodos "set" e "get", pois a variavel salario esta privada na classe Funcionario
 	}
	
	public void setLinguagem(String linguagem){
		this.linguagem = linguagem;
	}
	
	public String getLinguagem(){
		return linguagem;
	}
	
	public void imprimir(){
		super.imprimir();
//		System.out.println("Nome: " + getNome());
//		System.out.println("Idade: " + getIdade());
//		System.out.println("Salário: " + getSalario());
		System.out.println("Linguagem: " + getLinguagem());
	}

}
