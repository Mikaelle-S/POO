import java.util.Scanner;

public class Atv3q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o caractere:");
        String ctr = sc.nextLine();
        int check = verificar(ctr);
        System.out.println("" + check);
    }
    public static int verificar(String ctr){
        for(int i=0;i<ctr.length();i++){
            char c = ctr.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                return 1;
            } 
        }
        return 0;
    }
}