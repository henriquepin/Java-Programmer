package cap4;

public class ExemploSwitchCasePaises {
	public static void main(String[] args) {
		String pais = "brasil";
		
		switch (pais){
			case "brasil":
			case "portugal":
				System.out.println("Bom dia!");
				break;
			case "frança":
				System.out.println("Bon jour!");
				break;
			case "méxico":
			case "argentina":
			case "espanha":
				System.out.println("Buenos dias");
				break;
			default:
				System.out.println("Good Morining!");
		}
		
		System.out.println("Seu país é: " + pais);
	}
}
