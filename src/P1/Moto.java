package P1;

public class Moto {
    private String marca;       //similar
    private String motor;       //similar
    private int cilindradas;    //não identico
	
    public Moto(String marca, String motor, int cilindradas) {
        this.marca = marca;
        this.motor = motor;
        this.cilindradas = cilindradas;
    }

    public String getMarca() {      //similar
        return marca;
    }

    public String getMotor() {      //similar
        return motor;
    }

    public int getCilindradas() {   //não identico
        return cilindradas;         //não identico
    }
	
    public String imprimir() {
        return "Marca: " + getMarca() + ", Motor: " + getMotor() + " de " + getCilindradas() + " cilindradas."; 				
    }
}