import java.io.InterruptedIOException;

public class Labirinto{

    private static final char vertical = '|', horizontal = '-', path='.', semSaida='x';
    private static final char vazio = ' ', obstaculo='#', entrada='E', saida='S';
    private static final int TAM = 10;
    private static final double prob = 0.6;
    private static char[][] tab;
    private static int inicio[] = new int[2];
    private static int caminho[] = new int[2];
    private static int fim[] = new int[2];

    public static void main(String[]args){
        tab = new char[TAM][TAM];
        formarTabuleiro();
        imprimrTabuleiro();
        try{
            if(encontrarCaminho(inicio[0], inicio[1])){
                System.out.println("Voce achou o caminho!!");
            } else{
                System.out.println("Nao tem caminho!.");
            }
        } catch(Exception e){
            System.out.println("Algo deu errado.");
        }
        
    }

    public static boolean encontrarCaminho(int linhaAtual, int colunaAtual) throws InterruptedException {
        boolean achou = false, fimCaminho;
        while(!achou){
            char[] temp = {
                tab[linhaAtual-1][colunaAtual], 
                tab[linhaAtual+1][colunaAtual], 
                tab[linhaAtual][colunaAtual-1], 
                tab[linhaAtual][colunaAtual+1]  
            };
                        
            fimCaminho = true;
            Thread.sleep(1000);
            for (char c : temp){
                if (c == saida) {
                    tab[linhaAtual][colunaAtual] = path;
                    imprimrTabuleiro();
                    return true;
                } else if (c == vazio){
                    fimCaminho = false;
                }
                 
            }

            if (fimCaminho){
                achou = true;
                if(!(linhaAtual == inicio[0] && colunaAtual == inicio[1]))
                    tab[linhaAtual][colunaAtual] = semSaida;
                imprimrTabuleiro();
            } else {

                for (int i=0; i < temp.length; i++) {
                    if (temp[i] == vazio){
                        if(!(linhaAtual == inicio[0] && colunaAtual == inicio[1]))
                            tab[linhaAtual][colunaAtual] = path;
                        caminho[0] = linhaAtual;
                        caminho[1] = colunaAtual;
                        imprimrTabuleiro();
                        switch (i){
                            case 0: 
                                if(encontrarCaminho(linhaAtual-1, colunaAtual))
                                    return true;                                
                                break;
                            case 1: 
                                if(encontrarCaminho(linhaAtual+1, colunaAtual))
                                    return true;                               
                                break;
                            case 2: 
                                if (encontrarCaminho(linhaAtual, colunaAtual-1))
                                    return true;
                                break; 
                            case 3: 
                                if (encontrarCaminho(linhaAtual, colunaAtual+1))
                                    return true;                               
                                break;                            
                            default:
                                break;
                        }
                    } 
                }
            }                 
        }
        return false;
    }

    public static int gerarNumero(int min, int max){
        return (int) (min + Math.round(Math.random()*(max-min)));
    }

    public static void formarTabuleiro(){
        for (int i=0; i < TAM; i++){
            tab[i][0] = vertical;
            tab[i][TAM-1] = vertical;
            tab[0][i] = horizontal;
            tab[TAM-1][i] = horizontal;
        }
        tab[TAM-1][0] = horizontal; 

        for (int i=1; i < TAM-1; i++){
            for (int j=1; j < TAM-1; j++){
                if(Math.random() > prob){
                    tab[i][j] = obstaculo;
                } else{
                    tab[i][j] = vazio;
                }
            }
        }
        inicio[0] = gerarNumero(TAM /2-1, 1);
        inicio[1] = gerarNumero(TAM/2-1,1 );
        fim[0] = gerarNumero(TAM-2, TAM/2);
        fim[1] = gerarNumero(TAM-2, TAM/2);

        tab[inicio[0]][inicio[1]] = entrada;
        tab[fim[0]][fim[1]] = saida;
    }

    public static void imprimrTabuleiro(){
        for (int i=0; i < TAM; i++){
            for (int j=0; j < TAM; j++){
               System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }    
}
