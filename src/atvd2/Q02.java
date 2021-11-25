/*
Escreva um programa que leia 10 números e que escreva na tela apenas os que forem ímpares.
*/
import java.util.Scanner;

public class Q02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        for(int i = 0; i<=10; i++){
            System.out.println("Entre com um numero:");
            num = sc.nextInt();
            if(num%2!=0){
                System.out.printf("Impar:%d\n",num);
            }
        }
        sc.close();
    }
}
