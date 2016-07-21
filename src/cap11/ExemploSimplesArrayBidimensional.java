package cap11;

public class ExemploSimplesArrayBidimensional {
	public static void main(String[] args) {

		//
		//	baseando-se na classe ArrayBidimensional, escreva o array notas do
		//	jeito "simple"
		//	
		
		int notas [][] = {{6, 7, 8}, 
						 {5, 3, 2},
						 {5, 4, 2},
						 {5, 6, 7}};
		
//		for(int i = 0; i < notas.length; i++){
//			for(int x = 0; x < notas[i].length; x++){
//				System.out.println(notas[i][x]);
//			}
//		}
		
		for(int nota[] : notas){
			for(int n : nota){
				System.out.println(n);
			}
		}
	}
}
