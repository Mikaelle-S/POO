/*
    Crie uma classe Carro.java adicionando atributos, como marca, modelo, ano de fabricação, 
    tipo de combustível (álcool, gasolina ou flex). Crie arquivo Main.java para definir e exibir os novos atributos.

 */
public class Carro{
    private String marca, modelo, tipoCombustivel;
    private int ano;

    public Carro(String marca, String modelo, String tipoCombustivel, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.ano = ano;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getAno() {
        return this.ano;
    }
}