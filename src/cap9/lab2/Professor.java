package cap9.lab2;

public class Professor extends Pessoa { // Professor É UMA Pessoa
	private float salario;
	private String disciplina;
	
	public void setSalario(float salario){
		this.salario = salario;
	}
	
	public float getSalario(){
		return salario;
	}
	
	public void setDisciplina(String disciplina){
		this.disciplina = disciplina;
	}
	
	public String getDisciplina(){
		return disciplina;
	}
	
	public Professor(String nome, int idade, char sexo, int numeroRG, String dataNasc, float salario, String disciplina){
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		setSalario(salario);
		setDisciplina(disciplina);
	}
	
	public void falar(String fala){
		System.out.println(getNome() + ": " + fala);
	}
	
	public void mostrarDados(){
//		System.out.println();
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Salário: " + getSalario());
		System.out.println("Disciplina: " + getDisciplina());
		System.out.println("Número RG: " + getRg().getNumeroRG());
		System.out.println("Data de Nascimento: " + getRg().getDataNasc());
	}

}
