package P3;
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

// Adicione o método imprimir() à classe veiculo, como descrevemos, e em seguida, rode o programa. Você verá que ele continua executando exatamente igual rodava antes.
// Então, exclua o método imprimir de uma das classes filhas (ex.: moto) e teste novamente. O que acontece?

// O programa continua rodando, porém um pouco diferente: quando invocamos o método imprimir() de um objeto da classe filha que já não tem esse método imprimir() próprio, será invocado o método herdado da classe veiculo, apresentando na tela de console apenas os atributos comuns definidos na classe pai: marca e motor.






// Seguindo a matéria foi mostrado o poliformismo, que parece deixar mais simples 

// import java.util.*;

// public class Main {
// 	public static void main(String[] args) {	  
// 		var veiculos = new ArrayList<Veiculo>();

// 		veiculos.add(new Carro("Ford Ka", "Firefly 1.0", 257));
// 		veiculos.add(new Carro("Fiat Uno", "Zetec Rocam 1.2", 290));
// 		veiculos.add(new Moto("Harley Davidson", "Milwaukee-Eight", 1868));
// 		veiculos.add(new Moto("Honda Biz", "OHC 4 tempos", 125));
// 		veiculos.add(new Onibus("Mercedes Benz", "V8", 50, true));
// 		veiculos.add(new Onibus("Scania Escolar", "V8", 15, false));

// 		for (var veiculo : veiculos) {
// 			System.out.println(veiculo.imprimir());
// 		}
// 	}
// }