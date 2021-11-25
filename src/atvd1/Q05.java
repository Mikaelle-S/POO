/*
Crie um programa para receber o comprimento de 3 pedaços de madeira e mostrar uma mensagem caso eles formem um triângulo. 
Dica: monte uma expressão usando operadores lógicos e que seja verdadeira somente quando o comprimento de cada pedaço de 
madeira é menor que a soma do comprimento dos 2 pedaços restantes (A < B + C e B < A + C e C < A + B).
*/
import java.util.Scanner;

public class Q05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = 0 , B = 0, C = 0;

        System.out.println("Entre com os 3 valores do comprimento:");
        System.out.println("Comprimento A:");
        A = sc.nextFloat();
        System.out.println("Comprimento B:");
        B = sc.nextFloat();
        System.out.println("Comprimento C:"); 
        C = sc.nextFloat();

        if(A<B+C && B<A+C && C<A+B){
            System.out.println("forma um triangulo");
        }
        else{
            System.out.println("Nao forma um triangulo");
        }
        sc.close();
    }
}    
