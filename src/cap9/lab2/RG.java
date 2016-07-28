package cap9.lab2;

public class RG {
	private int numeroRG;
	private String dataNasc;
	
	public void setNumeroRG(int numeroRG){
		this.numeroRG = numeroRG;	
	}
	
	public int getNumeroRG(){
		return numeroRG;
	}
	
	public void setDataNasc(String dataNasc){
		this.dataNasc = dataNasc;
	}
	
	public String getDataNasc(){
		return dataNasc;
	}

	public RG(int numeroRG, String dataNasc){
		setNumeroRG(numeroRG);
		setDataNasc(dataNasc);
	}
	
//	public String toString() {
//		return "Numero do RG: " + getNumeroRG() + "\nData do Nascimento: " + getDataNasc();
//    }
	
}
