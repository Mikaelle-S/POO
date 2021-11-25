/*
Elabore uma função que receba dois números positivos por parâmetro e retorne a soma dos N números inteiros existentes entre eles.
*/
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Atv3q5 obj = new Atv3q5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os dois valores:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.calculo(a, b);
    }
    public void calculo(int a, int b) {
        if(a>b)
            System.out.println("O primeiro valor deve ser menor que o segundo.");
        else{
            int soma = 0;
            for(int i=a; i<=b; i++){
                soma+=i;
                System.out.printf("[%d + %d = %d]\n",i,soma+-i,soma);
            }
        }
    }
}
