/*
Crie um programa para receber uma nota e imprimir uma mensagem de acordo com a seguinte tabela:
  De 0 até 3 – Você precisa melhorar muito!
  Maior que 3 e menor que 7 – Você está quase conseguindo!
  Maior ou igual a 7 e menor que 9 – Você conseguiu!
  Maior ou igual a 9 – Você conseguiu com distinção!
*/
import java.util.Scanner;

public class Q08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a nota:");
        int nota= sc.nextInt();
        
        if (nota>=0 && nota <=3){
            System.out.println("Voce precisa melhorar muito!");
        }
        else if(nota>3 && nota <7){
            System.out.println("Voce esta quase conseguindo!");
        }
        else if(nota>=7 && nota<9){
            System.out.println("Voce conseguiu!");
        }
        else{
            System.out.println("Voce conseguiu com distincao!");
        }
        sc.close();
    }
}
