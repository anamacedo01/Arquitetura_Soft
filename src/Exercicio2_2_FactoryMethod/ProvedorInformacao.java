package Exercicio2_2_FactoryMethod;
/**
 * 
 * @author Ana Paula Macedo 816114287
 * 			
 *
 */


public class ProvedorInformacao extends Texto{
	
	public ProvedorInformacao(){
		
	}
	public ProvedorInformacao(String texto){
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
}
