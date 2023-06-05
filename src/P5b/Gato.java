package P5b;

// todos os pets terão um nome e raça. Porém, para os peixes, não é relevante saber seu gênero.

// os gatos só aceitam receber festa dos seus donos caso estejam alimentados. Se não estiverem, simplesmente imprima “o gato te ignorou”. Após receberem festa, os gatos voltam a sentir fome.

public class Gato extends Pet { // Associação: meuDono é uma referência
    private String genero;
    private boolean alimentado; //Novo atributo
    public Gato(String nome, String raca, String genero,
    int idade, String forma, String tipoPelo) {
    super(nome, raca, idade, new CaudaPelo(forma, tipoPelo));
    this.genero = genero;
    this.alimentado = false; //Inicialização
    }
    @Override
    public void print() {
    super.print();
    System.out.println(" Gênero: " + this.genero);
    System.out.println("Alimentado: " + this.alimentado);
    }
    @Override
    public void realizarRefeicao() {
    super.realizarRefeicao();
    this.alimentado = true;
    }
    @Override
    public void agradarDono() {
    // Invoca método da classe Dono
    // Só se estiver alimentado
    if (alimentado) {
    super.agradarDono();
    } else {
    System.out.println("O gato te ignorou");
    }
    }
   }
   



