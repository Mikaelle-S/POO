/*
Construa um programa que recebe duas matrizes inteiras de ordem 5 e imprima a soma e a diferença entre elas.
*/
import java.util.Scanner;

public class Q07{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        int [][] matrizA = new int[5][5];
        int [][] matrizB = new int[5][5];
        int [][] matrizC = new int[5][5];

        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                System.out.printf("Elemento [%d][%d] da matriz A = ",i,j);
                matrizA[i][j] = sc.nextInt();
            }
        }
        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                System.out.printf("Elemento [%d][%d] da matriz B = ",i,j);
                matrizB[i][j] = sc.nextInt();
            }
        }
        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];  
                System.out.printf("[%d] - [%d] = [%d]\n",matrizA[i][j],matrizB[i][j],matrizC[i][j]);
            }
        }
        sc.close();
    }
}
