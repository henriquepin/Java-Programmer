package cap9.lab2;

abstract public class Pessoa {
	String nome;
	int idade;
	char sexo;
	RG rg;
	
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
	
	
	public Pessoa(String nome, int idade, char sexo, RG rg){
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setRg(rg);
	}
	
	abstract public void falar(String fala);
	
	abstract public void mostrarDados();
	
}
