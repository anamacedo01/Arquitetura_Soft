package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @author Ana Paula Macedo 816114287
 * 			
 *
 */



//Impress�o na Tela
public class ImpressaoTela implements Impressao {
	
	public void imprimir(String string) {
		System.out.println(string);
	}

}
