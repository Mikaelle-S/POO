import java.util.Scanner;

public class Atv3q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o nome:");
        String nome = sc.nextLine();
        int check = vogais(nome);
        System.out.println("O numero de vogais no nome eh de: " + check);
    }
    public static int vogais (String nome){
        int contarVogais = 0;
        nome.toLowerCase();
        for (int i = 0; i < nome.length(); i++){
            char c = nome.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                contarVogais++;
        }
        return contarVogais;
    }
}