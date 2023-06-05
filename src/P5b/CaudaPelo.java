package P5b;

// Renomeie a classe cauda para caudapelo. Adicione também a classe caudaescamas. Todos os pets terão uma cauda, mas o peixe possui escamas.

public class CaudaPelo extends Cauda{
	private String forma;
	private String tipoPelo;
	
	public CaudaPelo(String forma, String tipoPelo) {
		this.forma = forma;
		this.tipoPelo = tipoPelo;
	}
	public void print() {
		System.out.println("  Cauda:  " + this.forma + " com " + this.tipoPelo);
	}
}

