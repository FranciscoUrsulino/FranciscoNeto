package br.ufpb.dcx.aps.abstractfactory;

public  class FabricaWindos implements FabricaAbstrata {

	@Override
	public Janela criarJanela() {
		
		return new JanelaWindos();
	}

	@Override
	public Menu criarMenu() {
		
		return new MenuWindos();
	}

	@Override
	public Botao criarBotao() {
		
		return new BotaoWindos();
	}
	

}
