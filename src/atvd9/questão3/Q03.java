/*3. Livro (Classe Composta) Título, Autor, Capítulo, Editora (Classes Componentes)*/
public class Q03 {
    public static void main(String[] args) {
        Titulo t = new Titulo("Dom Casmurro");
        Autor a = new Autor(" Machado de Assis");
        Capitulo c = new Capitulo("Capitulo 135: Otelo");
        Editora e = new Editora("Livraria Garnier.");

        Livro livro = new Livro(t,a,c,e);
        System.out.println(livro.toString());
        
    }
}
