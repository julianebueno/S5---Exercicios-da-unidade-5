package P2;

public class Moto extends Veiculo{
    private int cilindradas;    //não identico
	
    public Moto(String marca, String motor, int cilindradas) {
        super(marca, motor);
        this.cilindradas = cilindradas;
    }

    // public int getCilindradas() {   //não identico
    //     return cilindradas;         //não identico
    // }
	
    public String imprimir() {
        return "Marca: " + marca + ", Motor: " + motor + " de " + cilindradas + " cilindradas."; 				
    }
}