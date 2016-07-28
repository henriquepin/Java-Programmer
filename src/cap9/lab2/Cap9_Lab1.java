package cap9.lab2;

public class Cap9_Lab1 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Professor("Rafael", 38, 'M', 298454, "05/02/1974", 2500, "português");
		p1.falar("Manuel?");
		
		Pessoa a1 = new Aluno("Manuel", 19, 'M', 521234567, "15/06/1993", 1099, "Ciencia da Computação");
		a1.falar("Presente");
		
		p1.falar("Claudia?");
		
		Pessoa a2 = new Aluno("Claudia", 22, 'F', 415678912, "12/08/1990", 799, "Administração");
		a2.falar("Presente\n");
		
		System.out.println("---- Professor: " + p1.getNome() + " ----");
		p1.mostrarDados();
		System.out.println("---- Aluno: " + a1.getNome() + " ----");
		a1.mostrarDados();
		System.out.println("---- Aluno: " + a2.getNome() + " ----");
		a2.mostrarDados();
			
	}
}
