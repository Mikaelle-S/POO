/*
Escreva um programa que leia um vetor com 30 elementos inteiros e escreva-os em ordem contrária a da leitura. 
*/
import java.util.Scanner;

public class Q08{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int [] vetor = new int[30];

        for(i=0; i<30; i++){
            System.out.printf("Entre com o %d elemento:\n",i+1);
            vetor[i] = sc.nextInt();
        }
        for(i = 29; i>=0;i--){
            System.out.printf("|%d|",vetor[i]);
        }
        sc.close();
    }
}
