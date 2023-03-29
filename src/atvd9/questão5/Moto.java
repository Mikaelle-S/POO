public class Moto{

    private Sistema sistema;
    private Motor motor; 
    private Combustivel combustivel;

    public Moto(Sistema sistema, Motor motor, Combustivel combustivel){
        this.sistema = sistema;
        this.motor = motor;
        this.combustivel = combustivel;
    }
    public Sistema getSistema() {
        return sistema;
    }
    public Motor getMotor() {
        return motor;
    }
    public Combustivel getCombustivel() {
        return combustivel;
    }
    @Override
    public String toString() {
        return String.format("%s%s%s",sistema.toString(), motor.toString(), combustivel.toString());
    }
}