public class Boca {
    private int quantidade;

    public Boca(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getBoca(){
        return quantidade;
    }
    @Override
    public String toString() {
        return String.format("%d Boca(s)\n",quantidade);
    }
}
