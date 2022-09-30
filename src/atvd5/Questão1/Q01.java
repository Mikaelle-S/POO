/*
Defina uma estrutura de dados para agrupar e representar os dados de um
automóvel (marca do fabricante, modelo, ano de fabricação e quantidade máxima
de passageiros).
*/
import java.util.Scanner;

public class Q01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as informacoes do primeiro automovel:");
        Automovel dados1 = lerDados(sc);
    
        System.out.println("\tAUTOMOVEL\t");
        imprimirDados(dados1);
    }
    public static Automovel lerDados(Scanner sc) {
        Automovel dados = new Automovel();
        System.out.println("Informe a marca do automovel:");
        dados.marca = sc.nextLine();
        System.out.println("Informe o modelo do automovel:");
        dados.modelo = sc.nextLine();
        System.out.println("Informe o ano do automovel:");
        dados.ano = sc.nextInt();
        System.out.println("Informe a quantidade maxima de passageiros:");
        dados.qntPassageiros = sc.nextInt();
        return dados;
    }
    public static void imprimirDados(Automovel dados ) {
        System.out.println("Marca: " + dados.marca);
        System.out.println("Modelo: " + dados.modelo);
        System.out.println("Ano: " + dados.ano);
        System.out.println("Quantidade maxima de passageiros: " + dados.qntPassageiros);
    }
}
