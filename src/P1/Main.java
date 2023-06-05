package P1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        var carros = new ArrayList<Carro>();
        var motos = new ArrayList<Moto>();

        carros.add(new Carro("Ford Ka", "Firefly 1.0", 257));
        carros.add(new Carro("Fiat Uno", "Zetec Rocam 1.2", 290));

        motos.add(new Moto("Harley Davidson", "Milwaukee-Eight", 1868));
        motos.add(new Moto("Honda Biz", "OHC 4 tempos", 125));

        for (var carro : carros) {
            System.out.println(carro.imprimir());
        }
        for (var moto : motos) {
            System.out.println(moto.imprimir());
        }
    }
}
// Quais métodos e atributos idênticos as classes moto e carro possuem?
// Existe algum método em comum, cuja implementação não seja idêntica? 
// Reflita: o significado do método é o mesmo em ambos os casos?
// Agora, observe a classe main. 
// Há trechos de códigos realizando praticamente as mesmas operações? Quais são eles?
// O que aconteceria na classe main se mais classes fossem inseridas?






// Classes moto e carro:

// a. Atributos em comum: marca e motor.

// Métodos em comum: getMarca(), getMotor().

// b. O método imprimir() é similar nas duas classes. Possui o mesmo papel: descrever a classe. Porém, sua implementação, difere um pouco.

// c. Classe main:

// São utilizadas duas listas, uma de carros e outra de motos.

// São feitos dois “for” praticamente idênticos, com a mesma função: imprimir os veículos.

// d. Para cada classe incluída, o código seria repetido mais uma vez.