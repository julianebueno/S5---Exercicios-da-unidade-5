package P5b;

// Altere a classes dono de modo que ele possa ter qualquer tipo de pet.

public class Dono {
	private String nome;
	private Pet pet; // Dono está associado com seu Pet

	public Dono(String nome) {
		this.nome = nome;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Pet getPet() {
		return this.pet;
	}

	public void alimentar() {
		pet.realizarRefeicao();
	}

	public void receberFesta() {
		System.out.println(this.nome + " está recebendo festa de " + this.pet.getNome());
	}


	public static void main(String[] args) {

		Dono maria = new Dono("Maria");
		System.out.println("\n*** Cão de " + maria.nome);
		Cao pipoca = new Cao("Pipoca", "Beagle", "Fêmea", 3, "Enrolada", "Pêlo curtinho");
		maria.setPet(pipoca); // Torna Pipoca o Pet de Maria
		pipoca.setMeuDono(maria); // Associa Pipoca com Maria
		maria.getPet().print();
		maria.alimentar(); // Maria alimenta o seu cão Pipoca
		pipoca.agradarDono(); // Pipoca agrada sua dona Maria

		System.out.println("\n*** Gata de " + maria.nome);
		Gato mel = new Gato("Mel", "Siamesa", "Fêmea", 2, "Lisa", "Pêlo liso");
		maria.setPet(mel); // Troca o Pet de Maria para a gata Mel
		mel.setMeuDono(maria); // Associa Mel com Maria
		maria.getPet().print();
		maria.alimentar(); // Maria alimenta Mel
		mel.agradarDono(); // Mel agrada sua dona Maria

		System.out.println("\n*** Peixe de " + maria.nome);
		Peixe nemo = new Peixe("Nemo", "Peixe Palhaço", 1, "Laranja");
		maria.setPet(nemo); // Troca o Pet de Maria para o peixe Nemo
		nemo.setMeuDono(maria); // Associa Nemo com Maria
		maria.getPet().print();
		nemo.agradarDono(); // Nemo agrada sua dona Maria
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