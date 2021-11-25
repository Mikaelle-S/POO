/*
Escreva um programa que lê o nome de um aluno, o nome de uma disciplina e as notas de 4 provas realizadas nela. 
Calcule e apresente na tela a média aritmética alcançada por essas notas. Imprima essa informação através de uma 
mensagem que informe também o nome do aluno e da disciplina cursada.
*/
import java.util.Scanner;

public class Q03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String disciplina;
        float nota1, nota2, nota3, nota4;
        float media;

        System.out.println("Informe o nome:");
        nome = sc.nextLine();
        System.out.println("Informe a disciplina:");
        disciplina = sc.nextLine();
        System.out.println("Entre com as 4 notas das provas:");
        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat(); 
        nota3 = sc.nextFloat();
        nota4 = sc.nextFloat();

        media = (nota1+nota2+nota3+nota4)/4;
        System.out.printf("Nome: %s\nDisciplina: %s\nMedia: %.2f\n",nome,disciplina,media);
        sc.close();
    }
}
