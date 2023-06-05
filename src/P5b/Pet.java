package P5b;

public class Pet {
    protected Dono meuDono;
    protected String nome;
    protected String raca;
    protected int idade;
    protected Cauda minhaCauda;
    public Pet(String nome, String raca, int idade, Cauda cauda) {
    this.nome = nome;
    this.raca = raca;
    this.idade = idade;
    this.minhaCauda = cauda;
    }

    public void setMeuDono(Dono meuDono) {
    this.meuDono = meuDono;
    }
    public String getNome() {
    return nome;
    }
    public void realizarRefeicao() {
    System.out.println(this.nome + " fazendo sua refeição.");
    }
    public void agradarDono() {
    this.meuDono.receberFesta();
    }

    public void print() {
    System.out.println(" Nome: " + this.nome);
    System.out.println(" Raça: " + this.raca);
    System.out.println(" Idade: " + this.idade);
    minhaCauda.print();
    }
}