package Exercicio7_1;
/**
 * 
 * @author Ana Paula Macedo 816114287
 * 			
 *
 */
public class ManipuladorInverter extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		StringBuffer buffer = new StringBuffer(string.length());
		for (int i = string.length(); i > 0; i--)
			buffer.append(string.charAt(i - 1));
		return buffer.toString();
	}
}
