public class Sistema {
    private String modelo;
    private String ignicao;
    private String bateria;

    public Sistema(String modelo, String ignicao, String bateria){
        this.modelo = modelo;
        this.ignicao = ignicao;
        this.bateria = bateria;
    }
    public String getModelo() {
        return modelo;
    }
    public String getIgnicao() {
        return ignicao;
    }
    public String getBateria() {
        return bateria;
    }
    @Override
    public String toString(){
        return String.format("Modelo: %s\nIgnição: %s\nBateria: %s\n",modelo,ignicao,bateria);
    }
}
