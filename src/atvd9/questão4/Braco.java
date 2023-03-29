public class Braco {
    private int quantidade;

    public Braco(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getBraco(){
        return quantidade;
    }
    @Override
    public String toString() {
        return String.format("%d Braco(s)\n",quantidade);
    }
}
