package cap6lab1;

public class Cap6_Lab1 {
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
//		f.nome = "Henrique";
//		f.sobrenome = "Pin";
//		f.cargo = "Programador";
//		f.salario = 10000;
		
//		System.out.println("Nome: " + f.nome);
//		System.out.println("Sobrenome: " + f.sobrenome);
//		System.out.println("Cargo: " + f.cargo);
//		System.out.println("Salário: " + f.salario);
		
		f.setNome("Henrique");
		f.setSobrenome("Pin");
		f.setCargo("Programador");
		f.setSalario(10000);
		
		
//		System.out.println("Nome: " + f.getNome());
//		System.out.println("Sobrenome: " + f.getSobrenome());
//		System.out.println("Cargo: " + f.getCargo());
//		System.out.println("Salário: " + f.getSalario());

		f.mostrarDados();
		
		
	}
}
