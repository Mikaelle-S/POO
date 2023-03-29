public class Autor {
    private String autor;

    public Autor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    @Override
    public String toString() {
        return String.format("Autor: %s\n",autor);
    }   
}