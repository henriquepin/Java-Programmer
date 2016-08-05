package cap14.lab;

import java.util.List;
import java.util.ArrayList;

public class Cap14_Lab02  {
	public static void main(String[] args) {
		
		ArrayList<Estudante> estudanteList = new ArrayList<>();
		
		estudanteList.add(new Estudante("Joana", 8.5, 8.5));
		estudanteList.add(new Estudante("Antônio", 6.0, 9.0));
		estudanteList.add(new Estudante("Mariana", 7.5, 9.0));
		estudanteList.add(new Estudante("Ricardo", 7.0, 6.0));
		estudanteList.add(new Estudante("Gustavo", 9.5, 10.0));
		
		estudanteList.forEach(e -> e.setMedia((e.getNotaMatematica() + e.getNotaPortugues())/2));
		
		System.out.println("Média dos Aluno \n--------------");
		estudanteList.forEach(e -> System.out.println(e.getNome() + ": " + e.getMedia()));
		
	}
}
