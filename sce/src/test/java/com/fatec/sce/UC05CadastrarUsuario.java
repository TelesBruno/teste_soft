package com.fatec.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.sce.model.Livro;
import com.fatec.sce.model.Usuario;

public class UC05CadastrarUsuario {

	//Retorna nome
	@Test
	public void CT05retornarNome(){
		// cenario
		Usuario usuario = new Usuario();
		usuario.setNome("Vitorio");
		assertEquals("Vitorio", usuario.getNome());
	}
	
	//Retorna ra
	@Test
	public void CT06retornarRA(){
		// cenario
		Usuario usuario = new Usuario();
		usuario.setRa("1234");
		assertEquals("1234" , usuario.getRa());;
	}
	/*	
	//1º If
	@Test
	public void CT07validarObjIgualThis(){
		// cenario
		Usuario usuario = new Usuario();
		assertTrue(usuario.equals(usuario));
	}
	
	//2º If
	@Test
	public void CT08validarObjNulo(){
		// cenario
		Usuario usuario = new Usuario();
		assertFalse(usuario.equals(null));
	}
	
	//3º If
	@Test
	public void CT09validarObjClasseDiferente(){
		// cenario
		Usuario usuario = new Usuario();
		Livro livro = new Livro();
		assertFalse(usuario.equals(livro));
	}
	
	//4º If
		@Test
		public void CT10validarNomeNulo(){
			// cenario
			Usuario usuario = new Usuario();
			Usuario objQueEuPassei = new Usuario();
			objQueEuPassei.setNome("Bob");
			Livro livro = new Livro();
			assertFalse(usuario.equals(objQueEuPassei));
		}
	
		*/
	

}
