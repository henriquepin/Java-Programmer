package cap9.lab2;

abstract public class Professor extends Pessoa {
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
	
	abstract public void falar(
	}
	
}
