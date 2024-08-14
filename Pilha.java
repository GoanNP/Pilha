public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;
    }

    public void insere(int elemento) {
        if (!cheia()) {
            dados[++topo] = elemento;
        } else {
            System.out.println("A pilha está cheia.");
        }
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public int remove() {
        if (!vazia()) {
            return dados[topo--];
        } else {
            System.out.println("A pilha está vazia.");
            return -1;
        }
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("A pilha está vazia.");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.print(dados[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);
        pilha.imprime();

        pilha.remove();
        pilha.imprime();

        pilha.insere(40);
        pilha.imprime();

        pilha.remove();
        pilha.remove();
        pilha.imprime();

        pilha.insere(50);
        pilha.imprime();

    }
}
