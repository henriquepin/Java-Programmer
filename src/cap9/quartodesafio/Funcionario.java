package cap9.quartodesafio;

abstract public class Funcionario {//classe abstrata, n�o consigo instanciar essa classe(criar um novo objeto Funcionario)
	private String nome;		   //com classe abstrata, � obrigatorio a heran�a (herdar a classe pai)
	private int idade;
	private double salario;
	
	public Funcionario(String nome, double salario, int idade){//construtor
		setNome(nome);
		setSalario(salario);
		setIdade(idade);
	}
	
//	public void setDados(String nome, double salario, int idade){
//		setNome(nome);
//		setIdade(idade);
//		setSalario(salario);
//	}
	
	
	abstract public void reajustarSalario();//m�todo abstrato
											//(obriga a classe herdeira a declarar ("criar") o metodo em quest�o)
	
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
		System.out.println("Sal�rio: " + getSalario());
	}
	
}
	
