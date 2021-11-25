/*
Escreva um programa que solicite um número entre 1 e 4. Caso o número digitado seja diferente, mostre a mensagem "Número inválido". 
Caso contrário, escreva o número na tela.
*/
import java.util.Scanner;

public class Q03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero:");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Numero: 1");
                break;
            case 2:
                System.out.println("Numero: 2");
                break;
            case 3:
                System.out.println("Numero: 3");
                break;
            case 4:
                System.out.println("Numero: 4");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
        sc.close();
    }
}
