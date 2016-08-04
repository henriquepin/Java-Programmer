package cap13.lab;

public class MaioresSalarios {
	public static void main(String[] args) {
		
		double salariosBrutos[] = {1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00};
		
		double salariosTop[] = {};
		
		salariosTop = DoubleArrayUtils.filtraValores(salariosBrutos, sal -> {
			if(sal >= 3000){
				return true;			
			}else{
				return false;
			}
		});
//		for(int i = 0; i < salariosTop.length; i++){
//			System.out.println(salariosTop[i]);
//		}
		
		DoubleArrayUtils.processaValores(salariosTop, sal -> System.out.println(sal));
		
	}
}