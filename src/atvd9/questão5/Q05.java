/*5. Elabore também classes para os exemplos que você mesmo criou na Atividade 01. */
public class Q05 {
    public static void main(String[] args) {
        Sistema s = new Sistema("Biz 110i","Eletrônica", "12V-4Ah");
        Motor m = new Motor("Elétrico",8.33, 109.1);
        Combustivel c = new Combustivel("Gasolina", 5.1, 1.0);
        Moto moto = new Moto(s,m,c);
        System.out.println(moto.toString());
        
    }
}
