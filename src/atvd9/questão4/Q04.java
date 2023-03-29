/* 4. Monstro (Classe Composta) Cabeça, Olho, Boca, Braço, Perna (Classes Componentes)*/
public class Q04 {
    public static void main(String[] args) {
        Cabeca cabeca = new Cabeca(3);
        Olho olho = new Olho(4);
        Boca boca = new Boca (1);
        Braco braco = new Braco(4);
        Perna perna = new Perna(3);
        Monstro monstro = new Monstro(cabeca,olho,boca,braco,perna);
        System.out.println(monstro.toString());
    }    
}
