package Exercicio1_1_Abstract_Factory;
/**
 * 
 * @author Ana Paula Macedo 816114287
 * 			
 *
 */


//Fabrica de impressão na tela
public class FabricaTela implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoTela();

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
