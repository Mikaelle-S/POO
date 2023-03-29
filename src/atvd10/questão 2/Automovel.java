class Automovel extends Terrestre{
    protected int numPortas;
    protected String cor;
    protected String placa;
    
    public Automovel(){

    }
    public Automovel(int capacidade, int numRodas, int numPortas, String cor, String placa ){
        super(capacidade, numRodas);
        this.numPortas = numPortas;
        this.cor = cor;
        this.placa = placa;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public int getNumPortas() {
        return numPortas;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }
    @Override
    public String toString() {
        return "Automovel [capacidade=" + capacidade + ", numRodas=" + numRodas + ", cor=" + cor + ", numPortas=" + numPortas + ", placa=" + placa + "]";
    }
}