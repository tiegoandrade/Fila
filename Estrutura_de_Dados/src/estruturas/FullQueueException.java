package estruturas;

//Exce��o usada para informar que h� uma fila cheia.
public class FullQueueException extends Exception {
	
	public FullQueueException (String message) {
		super(message);
	}
}

