package P1b;
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



// Crie uma nova classe, chamada veiculo.
// Em seguida, faça as seguintes alterações no código, como indicado:
// Copie os métodos e atributos que são idênticos na classe carro e moto para a classe veiculo e altere os construtores conforme o código a seguir.
// Altere a declaração das classes moto e veiculo para incluir a instrução extends veiculo.
// Exclua os métodos idênticos das classes carro e moto.
// Crie uma terceira classe onibus.
// Adicione a ela os atributos do número de passageiros e se é ou não articulado.
// Não esqueça também do método imprimir.
// E de criar alguns ônibus na classe main.


