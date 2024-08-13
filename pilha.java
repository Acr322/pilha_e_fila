public class Pilha {
    private String[] elementos;
    private int topo;
    private int capacidade;

    // Construtor da pilha
    public Pilha(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva.");
        }
        this.capacidade = capacidade;
        this.elementos = new String[capacidade];
        this.topo = -1;
    }

    // Adiciona um elemento à pilha
    public void empilhar(String elemento) throws Exception {
        if (topo + 1 == capacidade) {
            throw new IllegalStateException("Pilha cheia.");
        }
        topo++;
        elementos[topo] = elemento;
    }

    // Remove e retorna o elemento do topo da pilha
    public String desempilhar() throws Exception {
        if (topo == -1) {
            throw new IllegalStateException("Pilha vazia.");
        }
        String elemento = elementos[topo];
        topo--;
        return elemento;
    }

    // Verifica se a pilha está vazia
    public boolean estaVazia() {
        return topo == -1;
    }

    // Retorna o tamanho atual da pilha
    public int getTamanho() {
        return topo + 1;
    }
}
