package Exercicio4_2;

/**
 * 
 * @author Ana Paula Macedo 816114287
 * 			
 *
 */
public class Main {
	
	public static void main(String[] args) {
		// Cria o cliente com o adaptador.
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
