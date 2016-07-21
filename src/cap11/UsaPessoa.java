package cap11;

public class UsaPessoa {
	public static void main(String[] args) {
		
		Pessoa [] pessoas = new Pessoa[2]; //reserva o espa�o para guardar o objeto "Pessoa" (array � um objeto!)
	
		pessoas[0] = new Pessoa(); // cria o objeto que ficar� na posi��o "0" do array
		pessoas[0].setNome("Maria"); //atribui valores
		pessoas[0].setPeso(47);
		pessoas[0].setAltura(1.57);
		
		
		pessoas[1] = new Pessoa(); // cria o objeto que ficar� na posi��o "1" do array
		pessoas[1].setNome("Jos�"); //atribui valores
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
