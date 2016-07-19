package cap6;

public class Pessoa {
	String nome;	//variável de instância, ou
	int idade;		// atributo, ou 
	char sexo;		// característica do objeto
	boolean estadoCivil;
	
//
	void setNome (String nome){
		this.nome = nome;
	}
	
	String getNome(){
		return nome;
	}
	
// 	
	void setIdade (int idade){
		this.idade = idade;
	}
	
	int getIdade(){
		return idade;
	}
	
//	variavel char sexo
	void setSexo(char sexo){
		this.sexo = sexo;
	}
	
	char getSexo(){
		return sexo;
	}
	
//	variavel boolean estadoCivil
	void setEstadoCivil(boolean estadoCivil){
		this.estadoCivil = estadoCivil;
	}
	
	boolean getEstadoCivil(){
		return estadoCivil;
	}
	
	void mostrarDados(){
		System.out.println();
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Estado Civil: " + getEstadoCivil());

	}
// criar o metodo setDados para "seta" todos os atributos de uma vez		
	public void setDados (String nome, int idade, char sexo, boolean estadoCivil){
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setEstadoCivil(estadoCivil);
	}
	
// criar o metodo getDados para "getar" todos os atributos de uma vez
	String getDados(){
		return "Nome: " + getNome() +
			"\nIdade: " + getIdade() +
			"\nSexo: " + getSexo() +
			"\nEstado Civil: " + getEstadoCivil();
	}
	
	void imprimir(){
		System.out.println(getDados());
	}
		
}
