package cap12;

public class PrimeiraExcecao {
	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		
		try {//tratamento de exce��o
		System.out.println(x/y);
		} catch(java.lang.ArithmeticException erro) {//erro = nomeou o objeto ArithmeticException(classe)
			erro.printStackTrace();//rastrear o erro
			System.out.println("N�o pode dividir por zero...");
		}
		
		System.out.println("Continua��o...");
		
	}
	
}

