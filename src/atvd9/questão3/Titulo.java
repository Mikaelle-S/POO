public class Titulo {
    private String titulo;

    public Titulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString() {
        return String.format("Titulo: %s\n",titulo);
    }
}