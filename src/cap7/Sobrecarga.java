package cap7;

public class Sobrecarga {
	void mostrar(int valor){
		System.out.println("O valor informado foi: " + valor);
	}
	
	void mostrar(String nome){
		System.out.println("Foi informado o nome: " + nome);
	}
	
	void mostrar(String nome, String sobrenome){
		System.out.println("Foi informado o nome: " + nome + " " + sobrenome);
	}
	
	void mostrar(String nome, int valor){
		System.out.println("Foi informado o nome " + nome + " e o valor " + valor);
	}
	
	void mostrar(int valor, String nome){
		System.out.println("Foi informado o valor " + valor + " e o nome " + nome);
	}
	
	void mostrar(){
		System.out.println("Nada foi informado!");
	}
}
