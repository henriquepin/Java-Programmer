package cap14;

import java.util.ArrayList;
import java.util.List;

public class ExemploSortedByName {
	public static void main(String[] args) {
		
		List<Funcionario> lista = new ArrayList<>();
		
		lista.add(new Funcionario(3018, "Joaquim", "Desenvolvedor", 5500.0));
		lista.add(new Funcionario(1045, "Pedro", "Analista", 6500.0));
		lista.add(new Funcionario(1780, "Paulo", "Desenvolvedor", 7500.0));
		lista.add(new Funcionario(3018, "João", "Vendedor", 8500.0));
		lista.add(new Funcionario(3018, "Roberto", "Analista", 1000.0));
		lista.add(new Funcionario(3018, "Saulo", "Desenvolvedor", 7800.0));
		
		lista.stream()
			.sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()))
			.forEach(System.out::println);		
	}
}
