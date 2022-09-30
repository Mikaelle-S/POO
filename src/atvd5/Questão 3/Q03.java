/*
Escreva um programa que armazene os dados relacionados a um filme (nome,
autor, ano, preço) em uma estrutura de dados do tipo registro. Crie rotinas para ler e
para imprimir os dados desse tipo de registro. Crie uma rotina main para ler e
imprimir os dados de 3 diferentes filmes.
*/
import java.util.Scanner;

public class Q03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as informacoes do primeiro filme:");
        Filmes dados1 = lerDados(sc);
        limpaBuffer(sc);

        System.out.println("Digite as informacoes do segundo filme:");
        Filmes dados2 = lerDados(sc);
        limpaBuffer(sc);

        System.out.println("Digite as informacoes do terceiro filme:");
        Filmes dados3 = lerDados(sc);
        limpaBuffer(sc);

        System.out.println("\tPRIMEIRO FILME\t");
        imprimirDados(dados1);
        System.out.println("\tSEGUNDO FILME\t");
        imprimirDados(dados2);
        System.out.println("\tTERCEIRO FILME\t");
        imprimirDados(dados3);

    }
    public static Filmes lerDados(Scanner sc) {
        Filmes dados = new Filmes();
        System.out.println("Informe o nome do filme:");
        dados.nome = sc.nextLine();
        System.out.println("Informe o autor do filme:");
        dados.autor = sc.nextLine();
        System.out.println("Informe o ano do filme:");
        dados.ano = sc.nextInt();
        System.out.println("Informe o preco do filme:");
        dados.preco = sc.nextDouble();
        return dados;
    }
    public static void imprimirDados(Filmes dados ) {
        System.out.println("Nome: " + dados.nome);
        System.out.println("Autor: " + dados.autor);
        System.out.println("Ano: " + dados.ano);
        System.out.println("Preco : " + dados.preco);
    }
    private static void limpaBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
