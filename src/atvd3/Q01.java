/*
Crie um programa que lê uma String e imprima apenas os caracteres de índice ímpar.
*/
import java.util.Scanner;

public class Q01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        System.out.println("entre com o texto: ");
	    String txt = sc.nextLine();

	    System.out.println("As letras nas posicoes impares sao: ");
	    while (i <= txt.length() - 1) {
	        System.out.println("[ " + (i) + " ] " + txt.charAt(i));
	        i = i + 2;
        }
    }
}
