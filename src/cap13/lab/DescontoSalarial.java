package cap13.lab;



public class DescontoSalarial {
	public static void main(String[] args) {
		
		double salariosBrutos[] = {1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00};
		
		double salariosLiquidos[] = {};
		
		salariosLiquidos = DoubleArrayUtils.transformaValores(salariosBrutos, sal -> sal * 0.9);
		
		for(int i = 0; i < salariosLiquidos.length; i++){
			System.out.println(salariosLiquidos[i]);
			
		}
	}
}
