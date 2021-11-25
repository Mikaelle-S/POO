/*
Escreva um programa utilizando função que converta uma dada temperatura lida em Celsius para Fahrenheit.
*/
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor de celsius:");
        float celsius = sc.nextFloat();
        float fahrenheit = converter(celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
    public static float converter(float celsius){
        return((celsius*9)/5 + 32);
    }
}
