package cap9.lab2;

public class RG {
	private int numeroRG;
	private String dataNasc;
	
	public void setNumero(int numero){
		this.numeroRG = numero;	
	}
	
	public int getNumero(){
		return numeroRG;
	}
	
	public void setDataNasc(String dataNasc){
		this.dataNasc = dataNasc;
	}
	
	public String getDataNasc(){
		return dataNasc;
	}

	public RG(int numeroRG, String dataNasc){
		setNumero(numeroRG);
		setDataNasc(dataNasc);
	}
	
}
