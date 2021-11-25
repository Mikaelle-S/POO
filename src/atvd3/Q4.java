import java.util.Scanner;

public class Atv3q4 {
    public static void main(String[] args) {
        Atv3q4 f = new Atv3q4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor de 'n':");
        int n = sc.nextInt();
        System.out.println(f.fibonacci(n));
    }
    
    public int fibonacci(int n) {

    if (n == 0 || n == 1 )
      return n;

    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}