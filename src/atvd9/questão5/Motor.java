public class Motor {
    private String partida;
    private double potencia;
    private double cilindrada;

    public Motor(String partida, double potencia, double cilindrada) {
        this.partida = partida;
        this.potencia = potencia;
        this.cilindrada = cilindrada ;
    }
    public String getPartida() {
        return partida;
    }
    public double getPotencia() {
        return potencia;
    }
    public double getCilindrada() {
        return cilindrada;
    }
    @Override
    public String toString(){
        return String.format("Sistema de partida: %s\nPotência: %.2f cv\nCilindrada: %.1f cc\n",partida,potencia,cilindrada);
    }
}
