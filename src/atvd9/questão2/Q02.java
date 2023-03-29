/* 2. Computador (Classe Composta) Teclado, Monitor, Memória, Placa Mãe (Classes Componentes)*/
public class Q02 {
    public static void main(String[] args) {
        Memoria mr = new Memoria("HyperX", 4);
        Monitor mn = new Monitor("Samsung", 16);
        Placa p = new Placa("Asus", "i5");
        Teclado t = new Teclado("HyperX", "Mecânico");

        Computador computador = new Computador(mr,mn,p,t);
        System.out.println(computador.toString());
        
    }
}

