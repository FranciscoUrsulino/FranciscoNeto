package br.ufpb.dcx.aps.abstractfactory;

public class TelaProjeto {

	private Menu menu;
	private Janela janela;
	private Botao botao;
	private FabricaAbstrata fabrica;
	
	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;
	
	}
	
	public void montar() {
		this.botao = fabrica.criarBotao();
		this.janela = fabrica.criarJanela();
		this.menu = fabrica.criarMenu();
	}

	public String desenhar() {
		
		return janela.desenhar() + "(" + menu.desenhar() + "," + botao.desenhar() + ")";
	}
}
