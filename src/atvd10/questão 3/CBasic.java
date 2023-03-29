public class CBasic {
    protected String marca;
    protected String cor;
    protected String modelo;
    
    public CBasic(String marca, String cor, String modelo) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
    }

    public void ligar(CBasic celular){
        System.out.println("Celular " + celular.getMarca()+ " ligado!");
    }

    public void desligar(CBasic celular){
        System.out.println("Celular " + celular.getMarca()+ " desligado!");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Celular Basico [cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + "]";
    }
    
}
