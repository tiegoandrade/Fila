package estruturas;

// Exce��o usada para informar que h� uma fila vazia.
public class QueueEmptyException extends Exception {
	
	public QueueEmptyException (String message) {
		super(message);
	}
}
