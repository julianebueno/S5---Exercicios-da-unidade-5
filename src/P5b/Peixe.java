package P5b;

// todos os pets terão um nome e raça. Porém, para os peixes, não é relevante saber seu gênero.

public class Peixe extends Pet { // Associação: meuDono é uma referência
    public Peixe(String nome, String raca, int idade, String corEscama) {
    super(nome, raca, idade, new CaudaEscamas(corEscama));
    }
}
