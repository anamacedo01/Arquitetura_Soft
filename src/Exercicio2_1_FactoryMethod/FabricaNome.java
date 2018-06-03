package Exercicio2_1_FactoryMethod;
/**
 * 
 * @author Ana Paula Macedo 816114287
 * 			
 *
 */

public class FabricaNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
