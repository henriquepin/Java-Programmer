package cap13.lab;



public class DescontoSalarial {
	public static void main(String[] args) {
		
		double salariosBrutos[] = {1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00};
		
//		double salariosLiquidos[] = {};
		
		double salariosLiquidos[] = DoubleArrayUtils.transformaValores(salariosBrutos, salario -> salario * 0.9);
		
//		for(int i = 0; i < salariosLiquidos.length; i++){
//			System.out.println(salariosLiquidos[i]);
//			
//		}
		/*for aprimorado*/
//		for(double e: salariosLiquidos){
//			System.out.println(e);
//		}
		
		
		DoubleArrayUtils.processaValores(salariosLiquidos, salario -> System.out.println(salario));
	}
	
}