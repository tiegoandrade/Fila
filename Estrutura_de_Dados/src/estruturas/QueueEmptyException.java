package estruturas;

// Exceção usada para informar que há uma fila vazia.
public class QueueEmptyException extends Exception {
	
	public QueueEmptyException (String message) {
		super(message);
	}
}
