package P5b;

// Altere a classes dono de modo que ele possa ter qualquer tipo de pet.

public class Dono {
	private String nome;
	private Pet[]  pets;  // Dono está associado a um vetor pets de Pet

	public Dono(String nome) {
		this.nome = nome;   // Cria uma instância do vetor;
		pets = new Pet[3];  // vetor preparado para receber até 3 pets
	}						
	public void addPet (int index, Cao pet) { // inclui um objeto de cão
		this.pets[index] = pet;             // no vetor pets
	}


	// public void alimentarCaes() {
	// 	for(int i=0; i< 3; i++)            // Invoca realizarRefeicao
	// 		pets[i].realizarRefeicao();  // de cada objeto de pets
	// }
	// public void receberFesta() {        // Invoca o método receberFesta
	// 	for(int i=0; i< 3; i++)       // de cada objeto de pets
	// 		System.out.println(this.nome + " está recebendo festa de " 
    //                                 + this.pets[i].getNomeCao());
	// }
	public void listarPets() {      // lista todos os pets
		for(int i=0; i< 3; i++)
			System.out.println(pets.imprimir());
	}



	public static void main(String[] args) {

        // var maria = new ArrayList<Carro>();

		Dono  maria  = new Dono ("Maria");

		Cao pipoca = new Cao ("Pipoca", "Beagle", 3, "Fêmea", "Enrolada", "Pêlo curtinho");


		
		// Cao   bruce  = new Cao  ("Bruce", "Pug", "Macho", 2, "Caracol", "Pêlo curtinho");
		// Cao   jujuba = new Cao  ("Jujuba", "Maltês", "Fêmea", 1, "Enrolada", "Pêlo longo");


		maria.addPet   (0, pipoca); // Pipoca está na posição 0 de pets

		// maria.addPet   (1, bruce);  // Bruce  está na posição 1 de pets
		// maria.addPet   (2, jujuba); // jujuba está na posição 2 de pets

		pipoca.setMeuDono (maria);     // associa Pipoca com Maria
		// bruce.setMeuDono  (maria);     // associa Bruce com Maria
		// jujuba.setMeuDono (maria);     // associa Jujuba com Maria

		//Lista todos os cães de Maria
		System.out.println("Cãozinhos de " + maria.nome);
		maria.listarPets();

		// maria.alimentarCaes();  // Maria alimenta todos os  cães 
		// maria.receberFesta();   // Maria recebe festa de todos os cães
	}
}


// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         var carros = new ArrayList<Carro>();
//         var motos = new ArrayList<Moto>();
//         var onibus = new ArrayList<Onibus>();

//         carros.add(new Carro("Ford Ka", "Firefly 1.0", 257));
//         carros.add(new Carro("Fiat Uno", "Zetec Rocam 1.2", 290));

//         motos.add(new Moto("Harley Davidson", "Milwaukee-Eight", 1868));
//         motos.add(new Moto("Honda Biz", "OHC 4 tempos", 125));

//         onibus.add(new Onibus("Mercedes", "BioDiesel", 320, true));
//         onibus.add(new Onibus("Volvo", "Elétrico", 60, false));

//         for (var carro : carros) {
//             System.out.println(carro.imprimir());
//         }
//         for (var moto : motos) {
//             System.out.println(moto.imprimir());
//         }
//         for (var bus : onibus) {
//             System.out.println(bus.imprimir());
//         }
//     }
// }





// Mundo dos bichos 
// Exercício para uso da herança.

// Que tal melhorarmos o programa dos cães da Unidade 4 para permitirmos outros pets? 

// Ajuste o nome dos atributos para ficarem mais genéricos. Por exemplo, em vez de “nomeCao”, use simplesmente “nome”. Na verdade, não repetir o nome da classe nos atributos é considerado uma boa prática.

// Crie as classes gato e peixe, similares à classe cao. todos os pets terão um nome e raça. Porém, para os peixes, não é relevante saber seu gênero.

// Os pets também se alimentam e podem agradar seu dono. Porém, os gatos só aceitam receber festa dos seus donos caso estejam alimentados. Se não estiverem, simplesmente imprima “o gato te ignorou”. Após receberem festa, os gatos voltam a sentir fome.

// Altere a classes dono de modo que ele possa ter qualquer tipo de pet.

// Renomeie a classe cauda para caudapelo. Adicione também a classe caudaescamas. Todos os pets terão uma cauda, mas o peixe possui escamas.

// Faça o diagrama de classes do resultado. Dica: pode ser mais fácil resolver esses exercícios montando esse diagrama antes de implementar os códigos.