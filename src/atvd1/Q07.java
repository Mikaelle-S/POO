/*
Crie um programa para receber dois números e verificar se eles são iguais ou se um é maior que o outro. 
Imprima uma mensagem indicando se os números são iguais ou, no caso deles serem diferentes, imprima o maior valor digitado.
*/
import java.util.Scanner;

public class Q07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com dois numeros:");
        int n1 = sc.nextInt(); 
        int n2 = sc.nextInt();

        if(n1 == n2){
            System.out.println("Os numeros sao iguais");
        }
        else if (n1>n2){ 
            System.out.printf("%d eh maior que %d",n1,n2);     
        }
        else if (n1<n2){
            System.out.printf("%d eh menor que %d",n1,n2); 
        }
        sc.close();
    }
}
