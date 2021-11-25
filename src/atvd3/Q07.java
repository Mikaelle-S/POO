/*
Construa uma função que receba um nome e retorne o número de vogais.
*/
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o nome:");
        String nome = sc.nextLine();
        int check = vogais(nome.toLowerCase());
        System.out.println("O numero de vogais no nome eh de: " + check);
    }
    public static int vogais (String nome){
        int contarVogais = 0;
        for (int i = 0; i < nome.length(); i++){
            char c = nome.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                contarVogais++;
        }
        return contarVogais;
    }
}
