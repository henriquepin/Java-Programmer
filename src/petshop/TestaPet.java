package petshop;

import cap6.Cachorro;
import cap6.Racao;

//import cap6.* --> carrega as classes do pacote cap6, porem so carrega as classes que eu instancio(que eu estou utilzando)


public class TestaPet {
	public static void main(String[] args) {
		
		Cachorro c = new Cachorro (); // instanciando classe cachorro
		Racao r = new Racao (); // instanciando classe racao
		
		
		c.setNome("Toto");
		c.setIdade(15);
		c.setRaca("Vira");
		
		r.setTipo("1");
		r.setMarca("royal canin");
		
		c.mostrarDados();
		r.mostrarDados();
	}
}
