public class Terrestre extends Transporte{
    protected int numRodas;

    public Terrestre() {

    }
    public Terrestre(int capacidade, int numRodas){
        super(capacidade);
        this.numRodas = numRodas;
    }
    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
    public int getNumRodas() {
        return numRodas;
    }
    @Override
    public String toString() {
        return "Terrestre [capacidade=" + capacidade + ", numRodas=" + numRodas + "]";
    }
}