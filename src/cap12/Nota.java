package cap12;

public class Nota {
	private String aluno;
	private int nota;
	

	public Nota(String aluno, int nota) throws NotainvalidaException {
		this.setAluno(aluno);
		this.setNota(nota);
	}
	
	public String getAluno() {
		return this.aluno;
	}
	
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	
	public int getNota() {
		return this.nota;
	}
	
	public void setNota(int nota) throws NotainvalidaException {
		if(nota < 0 || nota > 10){
			NotainvalidaException erro = new NotainvalidaException();
			throw erro;
		}else{
			this.nota = nota;			
		}
	}
	
}
