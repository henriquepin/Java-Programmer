package cap7.lab;

public class Cap7_Lab3 {

	public static void main(String[] args) {
		Aluno joao = new Aluno();
		joao.setNome("Jo�o");
		Aluno.contadorDeAlunos++;
		joao.imprimeAluno();
		System.out.println("Contagem no objeto joao: " + Aluno.contadorDeAlunos + "\n");
		
		Aluno maria = new Aluno();
		maria.setNome("Maria");
		Aluno.contadorDeAlunos++;
		maria.imprimeAluno();
		System.out.println("Contagem no objeto maria: " + Aluno.contadorDeAlunos + "\n");
		
		Aluno marcos = new Aluno();
		marcos.setNome("Marcos");
		Aluno.contadorDeAlunos++;
		marcos.imprimeAluno();
		System.out.println("Contagem no objeto marcos: " + Aluno.contadorDeAlunos + "\n");
	
		
		System.out.println("Contador acessado diretamente da classe: " + Aluno.contadorDeAlunos);
		
	}

}
