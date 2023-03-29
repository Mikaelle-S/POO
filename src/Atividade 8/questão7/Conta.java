public class Conta{
    private double saldo, limiteTransferencia = 3000, limiteSaque = 1000;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
        if (saldo<0)
            saldo = 0;
    }

    public void Transferencia(double valorTransferencia){
        if(valorTransferencia<=limiteTransferencia){
            if(saldo >= valorTransferencia){
                this.saldo = saldo - valorTransferencia;
                System.out.printf("Transferência efetuado com sucesso.\nSeu saldo é %.2f\n", this.saldo);
            }else{
                System.out.println("Você não possui saldo suficiente para realizar essa operação!");
            }
        }else{
            System.out.println("Não foi possivel efetuar a transferência. Limite excedido!");
        }
    }
    
    public void Sacar(double valorSaque){
        if(valorSaque<=limiteSaque){
            if(saldo >= valorSaque){
                this.saldo = saldo - valorSaque;
                System.out.printf("Saque efetuado com sucesso.\nSeu novo saldo é %.2f\n", this.saldo);
            }else{
                System.out.println("Você não possui saldo suficiente para realizar essa operação!");
            }
        }else{
            System.out.println("Não foi possivel efetuar o saque. Limite excedido!");
        } 
    }
    public double getSaldo(){
        return saldo;
    }
    
}