package br.ufpb.dcx.aps.abstractfactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelaProjetoTest {

	@Test
	void test() {
		TelaProjeto telaProjeto = new TelaProjeto();
		telaProjeto.setFabrica(new FabricaWindos());
		telaProjeto.montar();
		assertEquals("JanelaWindows(MenuWindows,BotaoWindows)", 
				telaProjeto.desenhar());
	}

}
