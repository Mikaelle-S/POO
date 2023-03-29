public class Capitulo {
    private String capitulo;

    public Capitulo(String capitulo) {
        this.capitulo = capitulo;
    }
    public String getCapitulo() {
        return capitulo;
    }
    @Override
    public String toString() {
        return String.format("%s\n",capitulo);
    }
}