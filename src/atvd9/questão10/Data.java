public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }
    @Override
    public String toString() {
        return String.format("Data de Nascimento: %d/%d/%d\n",dia,mes,ano);
    }
    
}
