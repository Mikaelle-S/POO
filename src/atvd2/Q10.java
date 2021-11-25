/*
Realize a leitura de duas matrizes de inteiros, a primeira chamada de A de dimensões 3 x 4 e a segunda chamada de B de dimensões 3 x 2. 
Construa uma matriz C de dimensões 3 x 6, sendo essa a junção das duas outras matrizes. 
Para isso, você deve copiar os elementos das matrizes A e B para a matriz C.
*/
import java.util.Scanner;

public class Q10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        int [][] matrizA = new int[3][4];
        int [][] matrizB = new int[3][2];
        int [][] matrizC = new int[3][6];

        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                System.out.printf("Elemento [%d][%d] da matriz A = ",i,j);
                matrizA[i][j] = sc.nextInt();
            }
        }
        for(i=0; i<3; i++){
            for(j=0; j<2; j++){
                System.out.printf("Elemento [%d][%d] da matriz B = ",i,j);
                matrizB[i][j] = sc.nextInt();
            }
        }
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                matrizC[i][j] = matrizA[i][j];  
            }
        }
        for(i=0; i<3; i++){
            for(j=4; j<6; j++){
                matrizC[i][j] = matrizB[i][j-4];
            }
        }
        for(i=0; i <3;i++){
            for(j=0; j<6; j++){
                System.out.printf("[%d] ",matrizC[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
