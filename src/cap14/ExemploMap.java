package cap14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExemploMap {
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
		
		Stream<Funcionario> streamFunc = lista.stream();
		Stream<JogadorFutebol> streamJogador =
				streamFunc.map(f -> new JogadorFutebol(
						f.getNome(),
						f.getSalario() > 6000 ? "Atacante" : "Zagueiro"));
		
		streamJogador.forEach(System.out::println);

	}
}
