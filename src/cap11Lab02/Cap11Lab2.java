package cap11Lab02;

public class Cap11Lab2 {
	public static void main(String[] args) {
		
	if(args.length > 0){
		int soma = 0;
		String texto = "";
		
		for(int i = 0; i < args.length; i++){
			soma += Integer.parseInt(args[i]);
		}
		double media = soma / args.length;
		
		System.out.println(soma);
		System.out.println(media);
	
	}
	else{
		System.out.println("Entre com valores válidos para as idades");
	}
	
	}
}
