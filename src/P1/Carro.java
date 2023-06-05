package P1;

public class Carro {	
    private String marca;       //similar
    private String motor;       //similar
    private int portaMalas;     //não identico
	
    public Carro(String marca, String motor, int portaMalas) {
        this.marca = marca;
        this.motor = motor;
        this.portaMalas = portaMalas;
    }

    public String getMarca() {      //similar
        return marca;
    }

    public String getMotor() {      //similar
        return motor;
    }

    public int getPortaMalas() {    //não identico
        return portaMalas;          //não identico
    }
	
    public String imprimir() {
        return "Marca: " + getMarca() + ", Motor: " + getMotor() + " Porta malas: " + getPortaMalas() + " litros."; 				
    }
}




