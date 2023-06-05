package P3;

public class Moto extends Veiculo{
    private int cilindradas;    //não identico
	
    public Moto(String marca, String motor, int cilindradas) {
        super(marca, motor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {   //não identico
        return cilindradas;         //não identico
    }
	
    @Override //caso mude na classe pai, aqui mostra o erro por não estar mais conectados
    public String imprimir() {
        return "Marca: " + getMarca() + ", Motor: " + getMotor() + " de " + getCilindradas() + " cilindradas."; 				
    }
}