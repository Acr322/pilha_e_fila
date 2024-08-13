public class Fila {
    private String[] elementos;
    private int frente;
    private int tras;
    private int tamanho;
    private int capacidade;

    // Construtor da fila
    public Fila(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva.");
        }
        this.capacidade = capacidade;
        this.elementos = new String[capacidade];
        this.frente = 0;
        this.tras = -1;
        this.tamanho = 0;
    }

    // Adiciona um elemento à fila
    public void enfileirar(String elemento) throws Exception {
        if (tamanho == capacidade) {
            throw new IllegalStateException("Fila cheia.");
        }
        tras = (tras + 1) % capacidade;
        elementos[tras] = elemento;
        tamanho++;
    }

    // Remove e retorna um elemento da fila
    public String desenfileirar() throws Exception {
        if (tamanho == 0) {
            throw new IllegalStateException("Fila vazia.");
        }
        String elemento = elementos[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return elemento;
    }

    // Verifica se a fila está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Retorna o tamanho atual da fila
    public int getTamanho() {
        return tamanho;
    }
}
