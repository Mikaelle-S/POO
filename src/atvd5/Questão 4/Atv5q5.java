import java.util.Scanner;

public class Atv5q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o mes (1 a 12)");
        EnumMeses meses = lerMes(sc.nextInt());
        System.out.println("O mes selecionado eh " + imprimirMes(meses));
    }
    public static EnumMeses lerMes(int num){
        EnumMeses meses = EnumMeses.DEZEMBRO;
        switch (num) {
            case 1:meses = EnumMeses.JANEIRO; break;
            case 2:meses = EnumMeses.FEVEREIRO; break;
            case 3:meses = EnumMeses.MARCO; break;
            case 4:meses = EnumMeses.ABRIL; break;
            case 5:meses = EnumMeses.MAIO; break;
            case 6:meses = EnumMeses.JUNHO; break;
            case 7:meses = EnumMeses.JULHO; break;
            case 8:meses = EnumMeses.AGOSTO; break;
            case 9:meses = EnumMeses.SETEMBRO; break;
            case 10:meses = EnumMeses.OUTUBRO; break;
            case 11:meses = EnumMeses.NOVEMBRO; break;
        }
        return meses;
    }
    public static String imprimirMes(EnumMeses meses) {
        String mes = "Dezembro";
        switch (meses) {
            case JANEIRO: mes = "Janeiro"; break;
            case FEVEREIRO: mes = "Fevereiro"; break;
            case MARCO: mes = "Marco"; break;
            case ABRIL: mes = "Abril"; break;
            case MAIO: mes = "Maio"; break;
            case JUNHO: mes = "Junho"; break;
            case JULHO: mes = "Julho"; break;
            case AGOSTO: mes = "Agosto"; break;
            case SETEMBRO: mes = "Setembro"; break;
            case OUTUBRO: mes = "Outubro"; break;
            case NOVEMBRO: mes = "Novembro"; break;
        }
        return mes;
    }
}