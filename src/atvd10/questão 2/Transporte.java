public class Transporte{
    protected int capacidade;

    public Transporte() {

    }
    public Transporte(int capacidade){
        this.capacidade = capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public int getCapacidade() {
        return capacidade;
    }
    @Override
    public String toString() {
        return "Transporte [capacidade=" + capacidade + "]";
    }
}