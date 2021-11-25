import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner; 


public class JogoDaVelha { 
	private static int jog; 
	private static int[][] casa = new int[3][3]; 
	private static int x, y, win; 
    private static Jogador player1, player2;
    private static long inicio;
    private static Jogador[] players = new Jogador[50]; 
    private static int qntdPlayer = 0; 
    private static File arquivo = new File("ranking.obj");
	private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        lerPlayer();
        cadastro(); 
        setTempo();

	    int i = 0; 
        for (i = 0; i < 9; i++) { 
            grade();
            if (i % 2 == 0) { 
                jogo(2); 
            } else { 
                jogo(1); 
            }
            check();
            if (win == 1 || win == 2) { 
                i = 10; 
            } 
        } 
        grade();  
        System.out.println(); 
        if (win == 1) { 
            System.out.println("Jogador " + player1.nome + " eh o ganhador!");
            player1.vitorias = player1.vitorias + 1; 
		    player2.derrotas = player2.derrotas + 1; 
        } else if (win == 2) { 
            System.out.println("Jogador " + player2.nome  + " eh o ganhador!"); 
            player2.vitorias = player2.vitorias + 1;
		    player1.derrotas = player1.derrotas + 1; 
        } else { 
            System.out.println("Nao houve vencedor! O jogo foi empate!!"); 
        } 
        System.out.println("O tempo total de jogo foi de " + getTempo() + "s ");
        imprimirPlayer();
        salvarPlayer();
    }
    public static void cadastro(){ 
        System.out.println("Digite o nome do jogador 1:"); 
        String nome_player1 = sc.next(); 
	    player1 = buscarPlayer(nome_player1); 
        System.out.println("Digite o nome do jogador 2:");
        String nome_player2 = sc.next(); 
	    player2 = buscarPlayer(nome_player2);  
    }
    public static Jogador buscarPlayer(String nome){ 
        Jogador jogador = null; 
        for (int i = 0; (i < qntdPlayer) && (jogador == null); i++) { 
            if (players[i] != null &&
                players[i].nome.equalsIgnoreCase(nome)) { 
                jogador = players[i]; 
            } 
        } 
        if (jogador == null) { 
            jogador = new Jogador(); 
            jogador.nome = nome;
            if (qntdPlayer < 50) { 
                players[qntdPlayer] = jogador; 
                qntdPlayer = qntdPlayer + 1; 
            }
    
        } 
        return jogador; 
    }
    public static void imprimirPlayer(){ 
        System.out.println("------ Resultado dos jogadores --------"); 
        for (int i = 0; i < qntdPlayer ; i++) { 
            System.out.println("Nome: " + players[i].nome); 
            System.out.println(" | vitorias:" + players[i].vitorias); 
            System.out.println(" | derrotas:" + players[i].derrotas); 
        }
    }
    public static void desenhar(int x, int y){ 
        if (casa[x][y] == 1) { 
            System.out.print("X"); 
        } else if (casa[x][y] == 2) { 
            System.out.print("O"); 
        } else { 
            System.out.print(" "); 
        } 
    }
    public static void setTempo(){ 
        inicio = System.currentTimeMillis(); 
    }
    public static long getTempo(){ 
        return (System.currentTimeMillis() - inicio)/1000;
    }
    public static void grade(){ 
        System.out.print("\n  1   2   3\n"); 
        System.out.print("1 "); 
        desenhar(0, 0); 
        System.out.print("  | ");  
        desenhar(0, 1); 
        System.out.print("  | ");  
        desenhar(0, 2); 
        System.out.print("\n -----------\n2 ");  
        desenhar(1, 0); 
        System.out.print("  | ");  
        desenhar(1, 1); 
        System.out.print("  | ");  
        desenhar(1, 2); 
        System.out.print("\n -----------\n3 ");  
        desenhar(2, 0); 
        System.out.print("  | ");  
        desenhar(2, 1); 
        System.out.print("  | ");  
        desenhar(2, 2); 
    }
    public static void jogo (int jogador){ 
        int i = 0; 
        if (jogador == 1) { 
            jog = 1; 
            System.out.println("\n\n Vez do Jogador " + player1.nome); 
        } else { 
            jog = 2; 
            System.out.println("\n\n Vez do Jogador " + player2.nome); 
        }
        System.out.println("\n\n Vez do Jogador " + jog); 
	    while (i == 0) { 
            x = 0; 
            y = 0; 
            while (x < 1 || x > 3) { 
                System.out.print("Escolha a x (1,2,3):"); 
                x = sc.nextInt(); 
                if (x < 1 || x > 3) { 
                    System.out.println("x invalida! Escolha uma x entre 1 e 3."); 
                } 
            } 
            while (y < 1 || y > 3) { 
                System.out.print("Escolha a y (1,2,3):"); 

                y = sc.nextInt(); 
                if (y < 1 || y > 3) { 
                    System.out.println("y invalida! Escolha uma y entre 1 e 3."); 
                } 
            } 
            x = x - 1; 
            y = y - 1;
            if (casa[x][y] == 0) { 
                casa[x][y] = jog; 
                i = 1; 
            } else { 
                System.out.println("Posicao ocupada!"); 
            } 
        }
    }
    public static void check(){ 
        int i = 0;      
        for (i = 0; i < 3; i++) { 
            if (casa[i][0] == casa[i][1] && casa[i][0] == casa[i][2]) { 
                if (casa[i][0] == 1) win = 1; 
                if (casa[i][0] == 2) win = 2; 
            } 
        }
        for (i = 0; i < 3; i++) { 
            if (casa[0][i] == casa[1][i] && casa[0][i] == casa[2][i]) { 
                if (casa[0][i] == 1) win = 1; 
                if (casa[0][i] == 2) win = 2; 
            } 
        }  
        if (casa[0][0] == casa[1][1] && casa[0][0] == casa[2][2]) { 
            if (casa[0][0] == 1) win = 1; 
            if (casa[0][0] == 2) win = 2; 
        } 
        if (casa[0][2] == casa[1][1] && casa[0][2] == casa[2][0]) { 
            if (casa[0][2] == 1) win = 1; 
            if (casa[0][2] == 2) win = 2; 
        } 
    }
    public static void salvarPlayer(){
        try { 
            ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(arquivo));
            saida.writeObject(players); 
        } catch (Exception e) { 
            throw new RuntimeException(e); 
        }
    } 
    public static void lerPlayer() { 
        try { 
            ObjectInputStream saida = new ObjectInputStream(new FileInputStream(arquivo));
            players = (Jogador[]) saida.readObject();
            while (players[qntdPlayer] != null && qntdPlayer < 50) {
                qntdPlayer = qntdPlayer + 1;
            } 
        } catch (FileNotFoundException e) {
        } catch (Exception e) { 
            throw new RuntimeException(e); 
        } 
    }
}
