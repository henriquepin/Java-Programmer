package cap7;


public class UsaCalculo {
	public static void main(String[] args) {
//		Calculo c1 = new Calculo();
		
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		
	System.out.println("o valor da soma �: " + Calculo.somar(x, y));
	System.out.println("o valor da divis�o �: " +Calculo.dividir(x, y));
	System.out.println("o valor da multiplica��o �: " + Calculo.multiplicar(x, y));
	System.out.println("o valor da subtra��o �: " + Calculo.subtrair(x, y));
	
	}
}
