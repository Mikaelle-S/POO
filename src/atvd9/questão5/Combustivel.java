public class Combustivel {
    private String tipo;
    private double tanque;
    private double oleo;

    public Combustivel(String tipo, double tanque, double oleo){
        this.tipo = tipo;
        this.tanque = tanque;
        this.oleo = oleo;
    }
    public String getTipo() {
        return tipo;
    }
    public double getTanque() {
        return tanque;
    }
    public double getOleo() {
        return oleo;
    }
    @Override
    public String toString(){
        return String.format("Tipo de Combustível: %s\nTanque de Combustível: %.1f litros\nÓleo do Motor: %.1f litro\n",tipo,tanque,oleo);
    }
}
