import java.util.Scanner;

public class atv1q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = 0 , B = 0, C = 0;

        System.out.println("Entre com os 3 valores do comprimento:");
        System.out.println("Comprimento A:");
        A = sc.nextFloat();
        System.out.println("Comprimento B:");
        B = sc.nextFloat();
        System.out.println("Comprimento C:"); 
        C = sc.nextFloat();

        if(A<B+C && B<A+C && C<A+B){
            System.out.println("forma um triangulo");
        }
        else{
            System.out.println("Nao forma um triangulo");
        }
        sc.close();
    }
}    