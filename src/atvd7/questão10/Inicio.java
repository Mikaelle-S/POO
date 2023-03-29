/*
 * 10. Vamos utilizar nosso conhecimento para ver se conseguimos resolver um
 * problema real. Nosso dinheiro é uma das coisas mais importantes que temos
 * nos dias de hoje. Para isso, precisamos de um programa confiável que gerencia
 * exatamente quanto temos. Crie uma classe chamada Conta que consiga
 * gerenciar o quanto de dinheiro temos, onde as únicas operações que podemos
 * fazer com o nosso dinheiro guardado é sacar e depositar. Crie uma classe nova
 * chamada Início, que irá conter o método Main, e crie dois objetos da classe
 * Conta, um chamado contaCorrente e outro Poupança
 */
public class Inicio{
    public static void main(String[] args) {
        Conta corrente = new Conta(0);
        Conta poupanca = new Conta(50);
        
        System.out.println("\n######## CONTA CORRENTE ########\n");
        corrente.depositar(500);
        corrente.sacar(50);
        
        System.out.println("\n######## POUPAN�A ########\n");
        poupanca.depositar(1250);
        poupanca.sacar(2000);
    }
}