/*
Crie um programa para receber um número e indicar se ele é par ou ímpar.
*/
import java.util.Scanner;

public class Q06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero:");
        int num = sc.nextInt();
        
        if (num%2==0){
            System.out.printf("O numero %d eh par.\n",num);
        }
        else{
            System.out.printf("O numero %d eh impar.\n",num);
        }
        sc.close();
    }
}
