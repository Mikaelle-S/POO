/*
 * 10. Crie as classes apresentadas no diagrama abaixo e aplique a Composição para a
 * classe Pessoa, que além de possuir um atributo Nome será composta pelas classes
 * Data, Endereço e Contato para os atributos dataNasc, endereço e contato,
 * respectivamente.
 */


public class Q10 {
    public static void main(String[] args) {
        Data data = new Data(24,06,2000);
        Endereco endereco = new Endereco("Rua 5","Centro","Campina Grande","Paraiba","12345-789",123);
        Contato contato = new Contato("(083)3349-2098","(083)99123-4567","maria_gatinha_100@email.com");

        Pessoa pessoa = new Pessoa("Maria",data,endereco,contato);
        System.out.println(pessoa.toString());
    }
}
