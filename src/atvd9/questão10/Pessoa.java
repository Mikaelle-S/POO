public class Pessoa {
    private String nome;
    private Data data;
    private Endereco endereco;
    private Contato contato;

    public Pessoa(String nome, Data data, Endereco endereco, Contato contato){
        this.nome = nome;
        this.data = data;
        this.endereco = endereco;
        this.contato = contato;
    }
    public String getNome() {
        return nome;
    }
    public Data getData() {
        return data;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public Contato getContato() {
        return contato;
    }
    @Override
    public String toString() {
        return String.format("%s\n%s%s%s",nome,data.toString(),endereco.toString(),contato.toString());
    }
}
