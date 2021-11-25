/*
Crie um programa que leia um número e que imprima o seu valor ao quadrado. Caso o quadrado desse número seja igual a 0 (zero), o programa deve sair.
*/
import java.util.Scanner;
import java.lang.Math;

public class Q01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1, quadrado;

        while (num != 0){
            System.out.println("Entre com um numero:");
            num = sc.nextInt();
            System.out.println("O quadrado do numero eh " +  Math.pow(num,2));
        }
        sc.close();
    }
}
