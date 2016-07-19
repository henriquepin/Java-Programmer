package cap6;

public class Cachorro {
	private String nome; // atributo encapsulado
	private String raca; //variavel de isntancia com acesso privado
	private int idade; //somente acesso via metodo
	
// gerar getters e setter e o metodo mostrarDados()
	
//
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setRaca(String raca){
		this.raca = raca;
	}
	
	public String getRaca(){
		return raca;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public int getIdade(){
		return idade;
	}
	
	
	public void mostrarDados(){
		System.out.println("Nome: " + getNome());
		System.out.println("Raça: " + getRaca());
		System.out.println("Idade: " + getIdade());
	
	}
	
	
}

