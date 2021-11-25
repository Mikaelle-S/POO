import java.util.Scanner;

public class atv1q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A - Multiplicar\nB - Somar");
        int n1, n2;
        int multi, soma;
        char op = sc.next(".").charAt(0);

        if(op == 'A'){
            System.out.println("Entre com dois numeros:");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            multi = n1 * n2;
            System.out.printf("Resultado: %d",multi);
        }
        if (op == 'B'){
            System.out.println("Entre com dois numeros:");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            soma = n1 + n2;
            System.out.printf("Resultado: %d",soma);
        }
        sc.close();
    }
}