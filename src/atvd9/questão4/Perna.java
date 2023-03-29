public class Perna {
    private int quantidade;

    public Perna(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getPerna(){
        return quantidade;
    }
    @Override
    public String toString() {
        return String.format("%d Perna(s)\n",quantidade);
    }
}
