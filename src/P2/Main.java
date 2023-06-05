package P2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        var carros = new ArrayList<Carro>();
        var motos = new ArrayList<Moto>();
        var onibus = new ArrayList<Onibus>();

        carros.add(new Carro("Ford Ka", "Firefly 1.0", 257));
        carros.add(new Carro("Fiat Uno", "Zetec Rocam 1.2", 290));

        motos.add(new Moto("Harley Davidson", "Milwaukee-Eight", 1868));
        motos.add(new Moto("Honda Biz", "OHC 4 tempos", 125));

        onibus.add(new Onibus("Mercedes", "BioDiesel", 320, true));
        onibus.add(new Onibus("Volvo", "Elétrico", 60, false));

        for (var carro : carros) {
            System.out.println(carro.imprimir());
        }
        for (var moto : motos) {
            System.out.println(moto.imprimir());
        }
        for (var bus : onibus) {
            System.out.println(bus.imprimir());
        }
    }
}



// Altere a visibilidade do atributo marca para protected e do atributo motor para default, como no modelo.
// Em seguida, altere o método imprimir da classe moto para utilizar os atributos diretamente, sem a palavra-chave this.
// Altere também o método da classe carro para utilizar os atributos, mas prefixe-os com a palavra-chave this.
// Crie um pacote motos, mova a classe moto para lá e reflita: Por que um problema ocorreu?
// Uma das formas de eliminar esse problema seria trocar o atributo motor para public. Mas essa seria uma solução correta?


// Resposta da questão 4:
// Ao mover a classe moto para outro pacote, o atributo motor deixou de ser visível na classe moto. Para corrigir, ou teríamos que declará-lo como protected, ou utilizar modificadores de acesso.

// Resposta da questão 5:
// O modificador public permite que o atributo sempre seja acessível. Mas essa solução é ruim, pois remove o encapsulamento da classe. Utilizar o protected seria mais vantajoso, pois permitiria o acesso direto somente às classes filhas.