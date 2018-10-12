package com.fatec.sce;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SceApplicationTests.class, TestaConexaoComDB.class, UC01CadastraLivro.class,
		UC05CadastrarUsuario.class })
public class AllTests {

}
