package estruturas;

// Implementa��o de uma pilha utilizando um Array.
public class Fila {
	
	// Armazena uma constante que possui o valor padr�o de um array.
	private static final int CAPACIDADE = 5;
	
	// Atributo que representa o in�cio da fila.
	private int ponteiro = 0;
	
	// Atributo que representa o primeiro elemento da fila.
	private int primeiroFila = 0;
	
	// Array que armazena objetos inseridos em uma fila.
	private Object[] vetor;
		
	// Construtor que recebe um valor que representa o tamanho do array.
	public Fila(int tamanhoVetor) {
		this.vetor = new Object[tamanhoVetor];
	}
	
	// Construtor que recebe um tamanho padr�o de um array.
	public Fila() {
		this(CAPACIDADE);
	}
	
	
	// Adiciona um elemento no fim de uma fila.
	public void enfileirar(Object item) throws FullQueueException {
		
		 // Lan�a uma Exce��o caso a fila esteja cheia.
		 if (ponteiro == vetor.length) {
			throw new FullQueueException("A FILA EST� CHEIA! O m�ximo de elementos �: " + ponteiro);
		}
		
		// Atributo que armazena uma posi��o vaga de uma fila.
		int avail = (primeiroFila + ponteiro) % vetor.length;
		
		// Enfilerando o elemento passado como par�metro.
		vetor[avail] = item;
		
		// Colocando o ponteiro no pr�ximo lugar onde ser� enfileirado outro elemento.
		ponteiro++;
	}
	
	// Renive um elemento no fim de uma fila.
	public Object desenfileirar() throws QueueEmptyException {
		
		// Lan�a uma Exce��o caso a fila esteja vazia.
		if (estaVazio()) {
			throw new QueueEmptyException("A FILA EST� VAZIA! N�o foi poss�vel realizar o desenfileiramento");
		}
		
		// Coloca o elemento que ser� removido em um atributo tempor�rio.
		Object temp = vetor[primeiroFila];
		
		// Transforma o lugar onde o elemento foi retirado em vazio.
		vetor[primeiroFila] = null;
		
		// Calculo para descobrir onde est� o primeiro elemento da fila.
		primeiroFila = (primeiroFila + 1 ) % vetor.length;
		
		// Recoloca o ponteiro no seu devido lugar.
		ponteiro--;
		
		// Retorna o elementor retirado da fila.
		return temp;	
	}
	
	// Informa o tamanho de uma determinada fila.
	public int tamanho() {
		return ponteiro;
	}
	
	// Informa se uma fila est� fazia.
	public boolean estaVazio() {
		return (ponteiro == 0);
		
	}
	
	// Informa o pr�ximo elemento que poder� ser retidado.
	public Object primeiro() {
		
		// Se a fila estiver vazia, n�o retorna nada.
		if (estaVazio()) {
			return null;	
		}
		
		return vetor[primeiroFila];
	}
}
