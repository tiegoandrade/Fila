package estruturas;

//Exceção usada para informar que há uma fila cheia.
public class FullQueueException extends Exception {
	
	public FullQueueException (String message) {
		super(message);
	}
}

