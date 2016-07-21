package cap11;

public class UsaPessoa {
	public static void main(String[] args) {
		
		Pessoa [] pessoas = new Pessoa[2]; //reserva o espaço para guardar o objeto "Pessoa" (array é um objeto!)
	
		pessoas[0] = new Pessoa(); // cria o objeto que ficará na posição "0" do array
		pessoas[0].setNome("Maria"); //atribui valores
		pessoas[0].setPeso(47);
		pessoas[0].setAltura(1.57);
		
		
		pessoas[1] = new Pessoa(); // cria o objeto que ficará na posição "1" do array
		pessoas[1].setNome("José"); //atribui valores
		pessoas[1].setPeso(87);
		pessoas[1].setAltura(1.87);
		
//		pessoas[0].mostrarDados();
//		System.out.println("-----------------------");
//		pessoas[1].mostrarDados();
		
		
		for (Pessoa p : pessoas){
			p.mostrarDados();
		}
	}
}
