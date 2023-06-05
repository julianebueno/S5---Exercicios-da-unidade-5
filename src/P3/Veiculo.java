package P3;

public class Veiculo {
    private String marca;
    private String motor;

    public Veiculo(String marca, String motor){
        this.marca = marca;
        this.motor = motor;
    }

    public String getMarca(){
        return marca;
    }

    public String getMotor(){
        return motor;
    }

    public String imprimir() {
        return "Marca: " + getMarca() + ", Motor: " + getMotor(); 				
    }
}
