import java.util.Scanner;

public class atv1q7{
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