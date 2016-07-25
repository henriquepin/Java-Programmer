package cap9.primeirodesafio;

public class Cadastro {

	public static void main(String[] args) {
		
//		Funcionario f = new Funcionario();
//		f.setNome("Henrique");
//		f.setIdade(28);
//		f.setSalario(4000.00);
//		f.imprimir();//imprimindo antes de reajustar salario
//		System.out.println("-------------Rejuste de Salário--------------");
//		f.reajustarSalario();
//		f.imprimir();
		
		Programador p = new Programador();
		p.setLinguagem("Java");
		p.setNome("João");
		p.setIdade(40);
		p.setSalario(2000.00);
		p.imprimir();
		System.out.println("-------------Rejuste de Salário--------------");
		p.reajustarSalario();
		p.imprimir();

		System.out.println("---------------------------------------------");		
		Chefe c = new Chefe();
		c.setCelular("99885545");
		c.setNome("Pedro");
		c.setIdade(60);
		c.setSalario(10000.00);
		c.imprimir();
		System.out.println("-------------Rejuste de Salário--------------");
		c.reajustarSalario();
		c.imprimir();
		
		System.out.println("---------------------------------------------");				
		Motorista m = new Motorista();
		m.setCnh(554678448);
		m.setNome("Danilo");
		m.setIdade(55);
		m.setSalario(5555.00);
		m.imprimir();
		System.out.println("-------------Rejuste de Salário--------------");
		m.reajustarSalario();
		m.imprimir();
		
	}
	
}
