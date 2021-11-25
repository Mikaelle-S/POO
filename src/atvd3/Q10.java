/*
Elabore uma função que receba uma string e retorne a quantidade de consoantes.
*/
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o texto:");
        String txt = sc.nextLine();
        int check = consoante(txt);
        System.out.println("O numero de consoantes no texto eh de: " + check);
    }
    public static int consoante (String txt){
        int contarConsoante = 0;

        txt.toLowerCase();
        for (int i = 0; i < txt.length(); i++){
            char c = txt.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                contarConsoante++; 
            }
        }
        return contarConsoante;
    }
}
