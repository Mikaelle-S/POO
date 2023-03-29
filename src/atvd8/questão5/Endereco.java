public class Endereco{
    protected String rua, cidade, uf;
    protected int numero;

    public void endereco(String rua, int numero, String cidade, String uf){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }
    void mostraEndereco(){
        System.out.printf("Rua: %s n° %d\n%s - Uf%s\n",this.rua,this.numero,this.cidade,this.uf);
    }
    
}