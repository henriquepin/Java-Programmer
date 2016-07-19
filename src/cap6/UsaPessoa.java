package cap6;

public class UsaPessoa {
	public static void main(String[] args) {
		int x = 10; //x é uma variavel local de método que guarda um tipo primitivo
		String s = "Texto";	//x é uma variavel local de método que guarda um tipo construido (pois é uma classe, no caso String)
		int y;
		
		System.out.println("x: " + x);
//		System.out.println("y: " + y); // váriaveis locais de metodo devem ser inicializadas para que possam ser usadas
		
		// Instanciando a classe Pessoa
		
		Pessoa p; //p é uma variavel local de método que guarda um tipo construido 
		p = new Pessoa (); //e é conhecida como uma variavel de referencia (vulgarmente conhecida como objeto
		
//		Pessoa p1 = new Pessoa();
		
/*		System.out.println(p);
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		System.out.println("Sexo: " + p.sexo);
		System.out.println("Estado Civil: " + p.estadoCivil);
*/
		
		// Inicializando valores para os atributos de p
		
		p.nome = "João";
		p.idade = 22;
		p.sexo = 'M';
		
		
		System.out.println(p);
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		System.out.println("Sexo: " + p.sexo);
		System.out.println("Estado Civil: " + p.estadoCivil);

		System.out.println("----------------------Acesso via metodos-----------------------");
		
		
		p.setNome("Maria");
//		System.out.println("nome: " + p.getNome());
		
		p.setIdade(15);
//		System.out.println("idade: " + p.getIdade());
		
		p.setSexo('M');
//		System.out.println("sexo: " + p.getSexo());
		
		p.setEstadoCivil(false);				
//		System.out.println("estado civil: " + p.getEstadoCivil());
		
		p.mostrarDados();
		
		p.setDados("Jose", 15, 'M', true);
		
		p.mostrarDados();
		
		}
}
