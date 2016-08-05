package cap14;

import java.util.ArrayList;
import java.util.List;

public class ExemploStream {
	public static void main(String[] args) {
		
		/*Cria uma lista vazia de funcion�rios*/
		List<Funcionario> list = new ArrayList<>();
		
		/*Adiciona alguns funcion�rios na lista */
		list.add(new Funcionario(2005, "Manuel Silva", "Desenvolvedor", 3580.0));
		list.add(new Funcionario(3018, "Jo�o Batista", "Analista", 4580.0));
		list.add(new Funcionario(2008, "Pedro Barros", "Advogado", 8580.0));
		list.add(new Funcionario(3025, "Jo�o Paulo", "Desenvolvedor", 3580.0));
		list.add(new Funcionario(2852, "Carla Moreno", "Analista", 8880.0));
		list.add(new Funcionario(2485, "Jos� Carlos", "Atendente", 1280.0));
		list.add(new Funcionario(2855, "Eduardo ALves", "Coordenador", 13580.0));
		list.add(new Funcionario(2525, "Manuel", "Desenvolvedor", 2580.0));
		
		/*Executa sucessivas opera��es com os dados da lista */
		list.stream()
			.filter(f -> "Desenvolvedor".equals(f.getCargo()))
			.sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()))
			.skip(1)
			.limit(2)
			.forEach(System.out::println);
		
	}
}
