import java.util.Scanner;

public class atv1q10b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A - Multiplicar\nB - Somar\nC - Subtrair\nD - Dividir");
        int n1, n2;
        int multi, soma, sub, div;
        char op = sc.next(".").charAt(0);

        if(op == 'A'){
            System.out.println("Entre com dois numeros:");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            multi = n1 * n2;
            System.out.printf("Resultado: %d",multi);
        }else{
            if (op == 'B'){
                System.out.println("Entre com dois numeros:");
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                soma = n1 + n2;
                System.out.printf("Resultado: %d",soma);
            }
            else{
                if (op == 'C'){
                    System.out.println("Entre com dois numeros:");
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    sub = n1 - n2;
                    System.out.printf("Resultado: %d",sub);
                }
                else{
                    if (op == 'D'){
                        System.out.println("Entre com dois numeros:");
                        n1 = sc.nextInt();
                        n2 = sc.nextInt();
                        div = n1 / n2;
                        System.out.printf("Resultado: %d",div);
                    }
                }
            }
        }
        sc.close();
    }
}