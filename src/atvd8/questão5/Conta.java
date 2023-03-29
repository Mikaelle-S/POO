public class Conta{
    protected float saldo;
    protected int numConta, tipoConta;
    protected Pessoa titular;

    public void Contas (float saldo,int numConta, Pessoa titular){
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void TipoConta(int n){
        switch (n) {
            case 1: System.out.println("Esta é uma conta corrente!\n");
                break;
            case 2: System.out.println("Esta é uma conta poupança!\n");
                break;
            case 3: System.out.println("Esta é uma conta digital!\n");
                break;
            default:
                break;
        }
    }
}