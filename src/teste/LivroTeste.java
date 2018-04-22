package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import curso.angular.controller.LivroController;
import curso.angular.model.Livro;

public class LivroTeste {

	LivroController dao;
	Livro livro;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSalvarString() throws Exception {
		livro.setAutor("paulo coelho");
		livro.setDescricao("conto de fadas");
		dao.salvarOuAtualizar(livro);
		
	}

	@Test
	public void testListar() throws Exception {
		for(Livro l:dao.lista()){
			System.out.println("teste lista "+l.getDescricao());
		}
		
	}

	

}
