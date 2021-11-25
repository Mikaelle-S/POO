import java.util.Scanner;

public class atv1q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a nota:");
        int nota= sc.nextInt();
        
        if (nota>=0 && nota <=3){
            System.out.println("Voce precisa melhorar muito!");
        }
        else if(nota>3 && nota <7){
            System.out.println("Voce esta quase conseguindo!");
        }
        else if(nota>=7 && nota<9){
            System.out.println("Voce conseguiu!");
        }
        else{
            System.out.println("Voce conseguiu com distincao!");
        }
        sc.close();
    }
}