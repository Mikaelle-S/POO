public class Endereco {
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private int numero;

    public Endereco(String logradouro, String bairro, String cidade, String estado, String cep , int numero){
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numero = numero;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public String getCep() {
        return cep;
    }
    public int getNumero() {
        return numero;
    }
    @Override
    public String toString() {
        return String.format("Logradouro: %s\nBairro: %s\nCidade: %s\nEstado: %s\nCEP: %s\nNumero: %d\n",logradouro,bairro,cidade,estado,cep,numero);
    }
    
}
