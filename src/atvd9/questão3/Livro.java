public class Livro {
    private Titulo titulo;
    private Autor autor;
    private Capitulo capitulo;
    private Editora editora;

    public Livro(Titulo titulo, Autor autor, Capitulo capitulo, Editora editora){
        this.titulo = titulo;
        this.autor = autor;
        this.capitulo = capitulo;
        this.editora = editora;
    }
    public Titulo getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public Capitulo getCapitulo() {
        return capitulo;
    }
    public Editora getEditora() {
        return editora;
    }
    @Override
    public String toString() {
        return String.format("%s%s%s%s",titulo.toString(),autor.toString(),capitulo.toString(),editora.toString());
    }   
}