package Exercicio2_1_FactoryMethod;

/**
 * 
 * @author Ana Paula Macedo 816114287
 * 			
 *
 */



public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Jessica";
		String sobrenome = "Alexandre";
		
		fn.getNome(nome, sobrenome);

	}

}