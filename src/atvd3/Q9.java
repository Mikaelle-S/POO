import java.util.Scanner;

public class Atv3q9 {
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