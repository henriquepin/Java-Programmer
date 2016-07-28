package cap9.lab2;

abstract public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private RG rg; //relacionameto TEM UM (pessoa usa RG)
	
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
	
	public void setSexo(char sexo){
		this.sexo = sexo;
	}
	
	public char getSexo(){
		return sexo;
	}
	
	public void setRg(RG rg){
		this.rg = rg;
	}
	
	public RG getRg(){
		return rg;
	}
	
	
	public Pessoa(String nome, int idade, char sexo, RG rg){  // parametro é quando declara o metodo
		setNome(nome);										  // argumento é quando for invocar o metodo	
		setIdade(idade);
		setSexo(sexo);
		setRg(rg);
	}
	
	abstract public void falar(String fala);
	
	abstract public void mostrarDados();
	
}
