package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @author Ana Paula Macedo 816114287
 * 			
 *
 */



//Fabrica de impressão no arquivo
public class FabricaArquivo implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoArquivo("output.txt");

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
