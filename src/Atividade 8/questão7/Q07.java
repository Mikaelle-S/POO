public class Atv8q7{
    public static void main(String[] args) {
        Conta cliente1 = new Conta(500);
        Conta cliente2 = new Conta(2000);
        
        System.out.println("\n########################################\n");
        cliente1.Transferencia(500);
        cliente1.Sacar(50);
        
        System.out.println("\n########################################\n");
        cliente2.Transferencia(1000);
        cliente2.Sacar(500);
    }
}