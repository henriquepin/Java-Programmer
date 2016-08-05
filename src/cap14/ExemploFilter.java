package cap14;

import java.util.ArrayList;
import java.util.List;

public class ExemploFilter {
	public static void main(String[] args) {
		
		List<Funcionario> lista = new ArrayList<>();
		
		lista.add(new Funcionario(2005, "Manuel Silva", "Desenvolvedor", 5680.0));
		lista.add(new Funcionario(3018, "João Batista", "Analista", 4580.0));
		lista.add(new Funcionario(2005, "Pedro Barros", "Advogado", 8580.0));
		lista.add(new Funcionario(2005, "João Paulo", "Desenvolvedor", 3580.0));
		lista.add(new Funcionario(2005, "Carla Moreno", "Analista", 8880.0));
		lista.add(new Funcionario(2005, "José Carlos", "Atendente", 1280.0));
		lista.add(new Funcionario(2005, "Eduardo ALves", "Coordenador", 13580.0));
		lista.add(new Funcionario(2005, "Manuel", "Desenvolvedor", 7580.0));
		
		lista.stream()
			 .filter(f -> f.getCargo().equals("Desenvolvedor"))
			 .filter(f -> f.getSalario() > 5000)
			 .forEach(System.out::println);
		
	}
}
