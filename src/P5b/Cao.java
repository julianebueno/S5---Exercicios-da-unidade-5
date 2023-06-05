package P5b;

// todos os pets terão um nome e raça. Porém, para os peixes, não é relevante saber seu gênero.

public class Cao extends Pet { // Associação: meuDono é uma referência
	private String genero;
	public Cao(String nome, String raca, String genero,
	int idade, String forma, String tipoPelo) {
	super(nome, raca, idade, new CaudaPelo(forma, tipoPelo));
	this.genero = genero;
	}
	@Override
	public void print() {
	super.print();
	System.out.println(" Gênero: " + this.genero);
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




