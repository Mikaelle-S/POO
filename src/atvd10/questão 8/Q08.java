/* 
 * 8. Implemente em Java a classe Brinquedo apresentada na Figura a seguir, aplicando
 * o polimorfismo de sobrecarga nos métodos apontados pelas setas. Em seguida,
 * escreva um método main que cria diferentes brinquedos fazendo chamadas para
 * seus diferentes métodos construtores e chamando diferentes métodos velocidade().
*/
public class Q08 {
    public static void main(String[]args){
        Brinquedo aviao = new Brinquedo("aviao",80,20);
        Brinquedo carro = new Brinquedo("Carro", 50, 10);
        aviao.mover(aviao);
        carro.mover(carro);
    }
}
