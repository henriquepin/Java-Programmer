package cap9.lab2;

public class Aluno extends Pessoa {
	private float mensalidade;
	private String curso;
	
	
	public void setMensalidade(float mensalidade){
		this.mensalidade = mensalidade;
	}
	
	public float getMensalidade(){
		return mensalidade;
	}
	
	public void setCurso(String curso){
		this.curso = curso;
	}
	
	public String getCurso(){
		return curso;
	}
	
	public Aluno(String nome, int idade, char sexo, int numeroRG, String dataNasc, float mensalidade, String curso){
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		setMensalidade(mensalidade);
		setCurso(curso);
	}
	
	public void falar(String fala){
		System.out.println(getNome() + ": " + fala);
	}
	
	public void mostrarDados(){
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Mensalidade: " + getMensalidade());
		System.out.println("Curso: " + getCurso());
		System.out.println("Número RG: " + getRg().getNumeroRG());
		System.out.println("Data de Nascimento: " + getRg().getDataNasc());
		
	}
	
}
