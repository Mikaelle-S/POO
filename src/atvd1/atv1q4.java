import java.util.Scanner;

public class atv1q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma;

        System.out.println("Entre com os 5 numeros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt(); 
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        soma = n1 + n2 + n3 + n4 + n5;
        
        if (soma%2==0){
            System.out.printf("%d Eh multiplo de 2.\n",soma);
        }
        else{
            System.out.printf("%d Nao eh multiplo de 2.\n",soma);
        }
        sc.close();
    }
}