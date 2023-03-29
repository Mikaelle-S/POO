public class CXEletronico{
    
    protected float valorSaque;
    protected float valorDeposito;
    protected float saldo;
    Conta numContaDestino;
    protected float valor;

    void saldo(float saldo){
        this.saldo = saldo;
    }
    void sacar(float valorSaque){
        this.valorSaque = valorSaque;
    }
    void depositar(float valorDeposito){
        this.valorDeposito = valorDeposito;
    }
    void verificarSaldo(){
        System.out.printf("Seu saldo é .2f\n",saldo);
    }
    void transferir(Conta numContaDestino, float valor){
        this.numContaDestino = numContaDestino;
        this.valor = valor;
    }
    
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();
        Conta conta = new Conta();
        endereco.endereco("Rua 1",123,"Campina Grande","PB");
        pessoa.pessoa("Maria",endereco,"(00)1234-5678");
        
        System.out.println("DADOS PESSOAIS:\n");
        pessoa.mostraPessoa();
        endereco.mostraEndereco();

        System.out.println(conta);
        conta.TipoConta(3);
        
    }
}