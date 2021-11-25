/*
Elabore um programa que receba o valor da cotação do dólar, o valor em reais e apresente o valor em dólares.
*/
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dolar(sc);
    }
    public static void dolar(Scanner sc) {
        System.out.println("Entre com a cotacao do dolar: ");
        double cotacao_dolar = sc.nextDouble();

        System.out.println("Entre com o valor em real: ");
        double valor_real = sc.nextDouble();

        double valor_dolar = cotacao_dolar * valor_real;

        System.out.printf("O Valor em dolar eh %.2f \n", valor_dolar);
        
    }
}
