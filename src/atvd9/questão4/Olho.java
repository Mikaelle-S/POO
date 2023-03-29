public class Olho {
    private int quantidade;

    public Olho(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getOlho(){
        return quantidade;
    }
    @Override
    public String toString() {
        return String.format("%d Olho(s)\n",quantidade);
    }
}
