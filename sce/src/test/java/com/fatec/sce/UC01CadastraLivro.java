package com.fatec.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.sce.model.Livro;

public class UC01CadastraLivro {

	@Test
	public void test() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02cadastrarLivroComISBN_em_branco() {
		// cenario
		Livro livro = new Livro();
		try {
			// acao
			livro = ObtemLivro.comISBNInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03cadastrarLivroComISBN_nulo() {
		// cenario
				Livro livro = new Livro();

				try {
					// acao
					livro = ObtemLivro.comISBNInvalido_nulo();
					fail("deveria lançar uma exceção");
				} catch (RuntimeException e) {
					// verificacao
					assertEquals("ISBN invalido", e.getMessage());
				}
				
	}
	
	//Titulo nulo
	@Test
	public void CT04cadastrarLivroComTitulo_nulo() {
		// cenario
				Livro livro = new Livro();
				try {
					// acao
					livro.setTitulo(null);
					fail("deveria lançar uma exceção");
				} catch (RuntimeException e) {
					// verificacao
					assertEquals("Titulo invalido", e.getMessage());
				}
				
	}
	
		//Titulo vazio
		@Test
		public void CT04cadastrarLivroComTitulo_vazio() {
			// cenario
					Livro livro = new Livro();
					try {
						// acao
						livro.setTitulo("");
						fail("deveria lançar uma exceção");
					} catch (RuntimeException e) {
						// verificacao
						assertEquals("Titulo invalido", e.getMessage());
					}
		}
		
		//Autor nulo
		@Test
		public void CT05cadastrarLivroComAutor_nulo() {
			// cenario
					Livro livro = new Livro();
					try {
						// acao
						livro.setAutor(null);
						fail("deveria lançar uma exceção");
					} catch (RuntimeException e) {
						// verificacao
						assertEquals("Autor invalido", e.getMessage());
					}
		}
			
		// Autor vazio
		@Test
		public void CT06cadastrarLivroComAutor_vazio() {
			// cenario
			Livro livro = new Livro();
			try {
				// acao
				livro.setAutor("");
				fail("deveria lançar uma exceção");
			} catch (RuntimeException e) {
				// verificacao
				assertEquals("Autor invalido", e.getMessage());
			}
		}
				
				
		//Retorna isbn
		@Test
		public void CT07retornarISBN(){
			// cenario
			Livro livro = new Livro();
			livro.setIsbn("1234");
			assertEquals("1234", livro.getIsbn());
		}		
		
		//Retorna autor
				@Test
				public void CT08retornarAutor(){
					// cenario
					Livro livro = new Livro();
					livro.setAutor("Bob");
					assertEquals("Bob", livro.getAutor());
				}				
				//Retorna autor
				@Test
				public void CT08retornarTitulo(){
					// cenario
					Livro livro = new Livro();
					livro.setTitulo("BobBooks");
					assertEquals("BobBooks", livro.getTitulo());
				}	
}
