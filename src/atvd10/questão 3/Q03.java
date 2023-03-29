/*  
 * 3. Hoje, os celulares estão cada vez mais sofisticados, mp3, mp4, acesso web, câmera
 * digital... Crie uma hierarquia de classes que possui no topo da hierarquia o celular
 * mais básico, aquele que simplesmente liga e atende ligações, e que vai sendo
 * refinada com várias outras classes que definem celulares mais sofisticados e
 * modernos. Para isso, use a hierarquia e nos construtores das classes use o
 * operador super. Na hierarquia, defina no mínimo três classes. Em seguida,
 * acrescente agora os métodos que darão as funcionalidades dos telefones móveis
 * (celulares). Uma observação é que os métodos ligar() e atender() não precisam ser
 * criados novamente nas classes filhas. Uma vez que ele deve estar presente na
 * classe Mãe da hierarquia (celular mais simples).
*/
public class Q03 {
    public static void main(String[]args){
        CBasic samsung = new CModern("Samsung","Branco","S20",true, true, true);
        System.out.println(samsung.toString());
        samsung.ligar(samsung);
        samsung.desligar(samsung);
    }
}