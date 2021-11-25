/*
Crie um programa em Java que receba 5 números e imprima a mensagem “Múltiplo de 2” caso a soma dos números digitados seja múltiplo de 2. 
Dica: para saber se um número é múltiplo de 2, basta verificar se o resto da divisão (operador %) do número por 2 é igual a zero.
*/
import java.util.Scanner;

public class Q04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma;

        System.out.println("Entre com os 5 numeros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt(); 
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        soma = n1 + n2 + n3 + n4 + n5;
        
        if (soma%2==0){
            System.out.printf("%d Eh multiplo de 2.\n",soma);
        }
        else{
            System.out.printf("%d Nao eh multiplo de 2.\n",soma);
        }
        sc.close();
    }
}
