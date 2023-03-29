public class Cabeca {
    private int quantidade;

    public Cabeca(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getCabeca(){
        return quantidade;
    }
    @Override
    public String toString() {
        return String.format("%d Cabeca(s)\n",quantidade);
    }
}
