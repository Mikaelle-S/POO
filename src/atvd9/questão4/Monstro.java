public class Monstro {
    private Cabeca cabeca;
    private Olho olho;
    private Boca boca;
    private Braco braco;
    private Perna perna;

    public Monstro(Cabeca cabeca, Olho olho, Boca boca, Braco braco, Perna perna){
        this.cabeca = cabeca;
        this.olho = olho;
        this.boca = boca;
        this.braco = braco;
        this.perna = perna;
    }
    public Cabeca getCabeca() {
        return cabeca;
    }
    public Olho getOlho() {
        return olho;
    }
    public Boca getBoca() {
        return boca;
    }
    public Braco getBraco() {
        return braco;
    }
    public Perna getPerna() {
        return perna;
    }
    @Override
    public String toString() {
        return String.format("%s%s%s%s%s",cabeca.toString(),olho.toString(),boca.toString(),braco.toString(),perna.toString());
    }
}
