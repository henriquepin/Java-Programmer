package cap7;


public class UsaCalculo {
	public static void main(String[] args) {
//		Calculo c1 = new Calculo();
		
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		
	System.out.println("o valor da soma é: " + Calculo.somar(x, y));
	System.out.println("o valor da divisão é: " +Calculo.dividir(x, y));
	System.out.println("o valor da multiplicação é: " + Calculo.multiplicar(x, y));
	System.out.println("o valor da subtração é: " + Calculo.subtrair(x, y));
	
	}
}
