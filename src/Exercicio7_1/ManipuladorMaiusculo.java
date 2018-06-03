package Exercicio7_1;
/**
 * 
 * @author Ana Paula Macedo 816114287
 * 			
 *
 */
public class ManipuladorMaiusculo extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string.toUpperCase();
	}
}
