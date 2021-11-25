/*
Faça um programa que leia uma matriz MxN, onde M e N são informados pelo usuário, e que imprima o maior valor encontrado na matriz.
*/
import java.util.Scanner;

public class Q06{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,m,n, maior = 0;

        System.out.println("Entre com o tamanho de M e N:");
        m = sc.nextInt(); n = sc.nextInt();

        int [][] matriz = new int[m][n];
        
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                System.out.printf("Elemento [%d][%d] da matriz = ",i,j);
                matriz [i][j] = sc.nextInt();

                if(matriz[i][j]>maior){
                    maior = matriz[i][j];
                }
            }
        }
        for(i=0;i<m; i++){
            for(j=0; j<n; j++){
                System.out.print(matriz[i][j]+"\t");
            }
        }
        System.out.printf("\nO maior numero eh: [%d]",maior);
        sc.close();
    }
}
