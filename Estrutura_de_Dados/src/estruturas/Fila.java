package estruturas;

// Implementação de uma pilha utilizando um Array.
public class Fila {
	
	// Armazena uma constante que possui o valor padrão de um array.
	private static final int CAPACIDADE = 5;
	
	// Atributo que representa o início da fila.
	private int ponteiro = 0;
	
	// Atributo que representa o primeiro elemento da fila.
	private int primeiroFila = 0;
	
	// Array que armazena objetos inseridos em uma fila.
	private Object[] vetor;
		
	// Construtor que recebe um valor que representa o tamanho do array.
	public Fila(int tamanhoVetor) {
		this.vetor = new Object[tamanhoVetor];
	}
	
	// Construtor que recebe um tamanho padrão de um array.
	public Fila() {
		this(CAPACIDADE);
	}
	
	
	// Adiciona um elemento no fim de uma fila.
	public void enfileirar(Object item) throws FullQueueException {
		
		 // Lança uma Exceção caso a fila esteja cheia.
		 if (ponteiro == vetor.length) {
			throw new FullQueueException("A FILA ESTÁ CHEIA! O máximo de elementos é: " + ponteiro);
		}
		
		// Atributo que armazena uma posição vaga de uma fila.
		int avail = (primeiroFila + ponteiro) % vetor.length;
		
		// Enfilerando o elemento passado como parâmetro.
		vetor[avail] = item;
		
		// Colocando o ponteiro no próximo lugar onde será enfileirado outro elemento.
		ponteiro++;
	}
	
	// Renive um elemento no fim de uma fila.
	public Object desenfileirar() throws QueueEmptyException {
		
		// Lança uma Exceção caso a fila esteja vazia.
		if (estaVazio()) {
			throw new QueueEmptyException("A FILA ESTÁ VAZIA! Não foi possível realizar o desenfileiramento");
		}
		
		// Coloca o elemento que será removido em um atributo temporário.
		Object temp = vetor[primeiroFila];
		
		// Transforma o lugar onde o elemento foi retirado em vazio.
		vetor[primeiroFila] = null;
		
		// Calculo para descobrir onde está o primeiro elemento da fila.
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
	
	// Informa se uma fila está fazia.
	public boolean estaVazio() {
		return (ponteiro == 0);
		
	}
	
	// Informa o próximo elemento que poderá ser retidado.
	public Object primeiro() {
		
		// Se a fila estiver vazia, não retorna nada.
		if (estaVazio()) {
			return null;	
		}
		
		return vetor[primeiroFila];
	}
}
