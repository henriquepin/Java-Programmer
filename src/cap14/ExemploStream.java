package cap14;

import java.util.ArrayList;
import java.util.List;

public class ExemploStream {
	public static void main(String[] args) {
		
		/*Cria uma lista vazia de funcionários*/
		List<Funcionario> list = new ArrayList<>();
		
		/*Adiciona alguns funcionários na lista */
		list.add(new Funcionario(2005, "Manuel Silva", "Desenvolvedor", 3580.0));
		list.add(new Funcionario(3018, "João Batista", "Analista", 4580.0));
		list.add(new Funcionario(2005, "Pedro Barros", "Advogado", 8580.0));
		list.add(new Funcionario(2005, "João Paulo", "Desenvolvedor", 3580.0));
		list.add(new Funcionario(2005, "Carla Moreno", "Analista", 8880.0));
		list.add(new Funcionario(2005, "José Carlos", "Atendente", 1280.0));
		list.add(new Funcionario(2005, "Eduardo ALves", "Coordenador", 13580.0));
		list.add(new Funcionario(2005, "Manuel", "Desenvolvedor", 3580.0));
		
		/*Executa sucessivas operações com os dados da lista */
		list.stream()
			.filter(f -> "Desenvolvedor".equals(f.getCargo()))
			.sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()))
			.skip(1)
			.limit(2)
			.forEach(System.out::println);
		
	}
}
