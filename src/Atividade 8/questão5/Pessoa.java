public class Pessoa{
    protected String nome, telefone;
    protected Endereco endereco;
    protected Fisica cpf;
    protected Juridica cnpj;

    public void pessoa(String nome, Endereco endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cnpj = cnpj;
    }/*
    public String getNome(){
        return this.nome;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }
    public String getTelefone(){
        return this.telefone;
    }*/
    public void mostraPessoa(){
        System.out.printf("Nome: %s.\nEndereço: %s.\nTelefone: %s.\n",this.nome,this.endereco,this.telefone);
    }

}