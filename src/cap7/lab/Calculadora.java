package cap7.lab;

public class Calculadora {

	
	public double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}

	public double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}

	public int dividir(int valor1, int valor2) {
		int resultado = valor1 / valor2;
		return resultado;
	}

	// Métodos sobrecarregados
	public double subtrair(double valor1, double valor2) {
		double resultado;
		resultado = valor1 - valor2;
		return resultado;
	}

	public double subtrair(int valor1, double valor2) {
		double resultado;
		resultado = valor1 - valor2;
		return resultado;
	}

	public double subtrair(double valor1, int valor2) {
		double resultado;
		resultado = valor1 - valor2;
		return resultado;
	}

}
