package cap11;

public class Gato {
	String nome;
	int idade;
	
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
	
//	public void mostrarDados(){
//		System.out.println("Nome: " + getNome());
//		System.out.println("Idade: " + getIdade());
//	}

	public String toString(){
		return "Nome: " + getNome() + 
				"\nIdade " + getIdade();
	}
	
}
