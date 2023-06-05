package P5b;

// todos os pets terão um nome e raça. Porém, para os peixes, não é relevante saber seu gênero.

public class Cao extends Pet{             // Associação: meuDono é uma referência da 
	private Dono   meuDono;  // classe Dono e também atributo da classe Cão
	
	private String genero;
	private CaudaPelo  minhaCauda; // Composição: Cão possui Cauda

	public Cao(String nome, String raca, int idade, String genero, String forma, String tipoPelo) {
		super(nome, raca, idade);
		this.genero = genero;
		this.minhaCauda = new CaudaPelo (forma, tipoPelo); 
	}                          
	public void setMeuDono(Dono meuDono) {
		this.meuDono = meuDono;
	}
	public void printCao() {
		System.out.println("  Nome:   " + nome);
		System.out.println("  Raça:   " + this.raca);
		System.out.println("  Gênero: " + this.genero);
		System.out.println("  Idade:  " + this.idade);
		minhaCauda.printCauda();
		System.out.println();
	}
	public void realizarRefeicao() {
		System.out.println(this.nome + " fazendo sua refeição.");
	}
	public void agradarDono() {
		this.meuDono.receberFesta(); // Invoca método da classe Dono
	}

	@Override //caso mude na classe pai, aqui mostra o erro por não estar mais conectados
    public String imprimir() {
        return "Marca: " + getMarca() + ", Motor: " + getMotor() + " Porta malas: " + getPortaMalas() + " litros."; 				
    }


}



// public class Carro extends Veiculo{	
//     private int portaMalas;     //não identico
	
//     public Carro(String marca, String motor, int portaMalas) {
//         super(marca, motor);
//         this.portaMalas = portaMalas;
//     }

//     public int getPortaMalas() {    //não identico
//         return portaMalas;          //não identico
//     }
	
//     @Override //caso mude na classe pai, aqui mostra o erro por não estar mais conectados
//     public String imprimir() {
//         return "Marca: " + getMarca() + ", Motor: " + getMotor() + " Porta malas: " + getPortaMalas() + " litros."; 				
//     }
// }




