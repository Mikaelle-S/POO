/*
 * 6. Seguindo o exemplo apresentado para as classes Automóvel e Motor, aplique o
 * caso 1 para a classe Computador que agrega uma placa mãe, o caso 2 para a
 * classe Livro que agrega seu título e autor, e o caso 3 para a classe Monstro que
 * agrega cabeça e boca
 */
public class Q06 {
    //Caso 1 (Chamada no construtor)
    public Computador(){
        p = new Placa("Asus", "i5");
    }
    //Caso 2 (Chamada em qualquer método)
    public comprarLivro(){
        t = new Titulo();
        a = new Autor();
    }
    public comprarLivro(String titulo, String autor){
        t = new Titulo("Dom Casmurro");
        a = new Autor(" Machado de Assis");
    }
    //Caso 3 (Chamada fora da classe)
    /*main...*/{
        Monstro monstro = new Monstro();
        Cabeca cabeca = new Cabeca();
        Boca boca = new Boca ();
        monstro.setCabeca(3);
        monstro.setBoca(1);
    }
}
