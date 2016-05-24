package estruturas;

public class Aplicacao {
 
	public static void main(String[] args) {
		
		// Cria��o de um objeto do tipo Fila.
		Fila f1 = new Fila();
		
		// Execu��o e tratamento dos m�todos.
		try {
			f1.enfileirar("A");
			f1.enfileirar("B");
			f1.enfileirar("C");
		} catch (FullQueueException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Object s1 = f1.desenfileirar();
			System.out.print("O valor removido �: " + s1);
		} catch (QueueEmptyException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Object s2 = f1.desenfileirar();
			System.out.print(", " + s2);
		} catch (QueueEmptyException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Object s3 = f1.desenfileirar();
			System.out.print(", " + s3);
		} catch (QueueEmptyException e) {
			System.out.println(e.getMessage());
		}		
		
		int y = f1.tamanho();
		System.out.println("\nO tamanho da Fila �: " + y);
		
		Object q = f1.primeiro();
		System.out.println("O elemento que est� no in�cio da fila �: " + q);		
	}
}

