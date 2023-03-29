public class Conta{
    double saldo ;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
        if (saldo<0)
            saldo = 0;
    }

    public void depositar(double valorDeposito){
        this.saldo = saldo + valorDeposito;
        System.out.printf("Deposito efetuado com sucesso.\nSeu saldo é %.2f\n", this.saldo);
    }
    
    public void sacar(double valorSaque){
        if(saldo >= valorSaque){
            this.saldo = saldo - valorSaque;
            System.out.printf("Saque efetuado com sucesso.\nSeu novo saldo é %.2f\n", this.saldo);
        }else{
            System.out.println("Você não possui saldo suficiente para realizar essa operação!");
        }
    }
    public double getSaldo(){
        return saldo;
    }
}