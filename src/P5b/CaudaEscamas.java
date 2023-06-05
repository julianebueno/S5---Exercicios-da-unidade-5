package P5b;

// Renomeie a classe cauda para caudapelo. Adicione também a classe caudaescamas. Todos os pets terão uma cauda, mas o peixe possui escamas.

public class CaudaEscamas extends Cauda {
    private String cor;

    public CaudaEscamas(String cor) {
        this.cor = cor;
    }
    @Override
    public void print() {
        System.out.println(" Cauda com escamas de cor " + this.cor);
    }
}
