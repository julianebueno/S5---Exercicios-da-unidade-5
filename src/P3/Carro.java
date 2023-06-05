package P3;

public class Carro extends Veiculo{	
    private int portaMalas;     //não identico
	
    public Carro(String marca, String motor, int portaMalas) {
        super(marca, motor);
        this.portaMalas = portaMalas;
    }

    public int getPortaMalas() {    //não identico
        return portaMalas;          //não identico
    }
	
    @Override //caso mude na classe pai, aqui mostra o erro por não estar mais conectados
    public String imprimir() {
        return "Marca: " + getMarca() + ", Motor: " + getMotor() + " Porta malas: " + getPortaMalas() + " litros."; 				
    }
}




