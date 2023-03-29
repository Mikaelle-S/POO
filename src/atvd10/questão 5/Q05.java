/*
 * 5. Crie as classes utilizando o princípio da herança, obedecendo à hierarquia da figura
 * abaixo (obs.: para facilitar, substitua na figura o tipo Calendar por String).
    *   a. Acrescente aos construtores a lista de parâmetros necessária para instanciar
    * o objeto. Por exemplo, a classe Pessoa deve ter nome, CPF e dataNasc. E
    * essa lista é acumulativa, ou seja, o construtor da classe Funcionário deve ter
    * a lista de seus atributos mais os atributos necessários para a classe Pessoa.
    * Dica: não deixe de usar a palavra-chave super em cada um dos construtores
    * para chamar o construtor da classe mãe, passando os atributos que são
    * mantidos por ela e seus ancestrais.
    *   b. Insira os seguintes métodos para apresentar os valores dos atributos das
    * classes, mostrarPessoa(), mostrarFuncionario(), mostrarChefe() e
    * mostrarAluno(), respectivamente, às classes Pessoa, Funcionário,
    * ChefeDepartamento e Aluno. Para imprimir os atributos, use o método
    * System.out.println() em cada um dos métodos.
    *   c. Crie uma classe TestaTudo com um método main(), que instancia um objeto
    * de cada uma das classe e exibe os valores dos atributos através de
    * chamadas aos métodos mostrarPessoa(), mostrarFuncionario(),
    * mostrarChefe() e mostrarAluno().
 */
import java.util.Calendar;
public class Q05 {
    public static void main(String [] args){
        Calendar dataNascPessoa = Calendar.getInstance();
        dataNascPessoa.set(1998, Calendar.DECEMBER, 01);
        Pessoa pessoa = new Pessoa("Ludmila", "123.456.789-00", dataNascPessoa);
        Calendar dataNascAluno = Calendar.getInstance();
        dataNascAluno.set(2001, Calendar.FEBRUARY, 23);
        Pessoa aluno = new Aluno("Jeffersson", "009.876.543-21", dataNascAluno, "192080");
        Calendar dataNascFuncionario = Calendar.getInstance();
        Calendar dataAdmissaoFuncionario = Calendar.getInstance();
        dataNascFuncionario.set(2000, Calendar.JUNE, 12);
        dataAdmissaoFuncionario.set(2019, Calendar.MAY, 15);
        Pessoa funcionario = new Funcionario("Natalia", "321.654.987-11", dataNascFuncionario, "12345678", dataAdmissaoFuncionario, 2500);
        Calendar dataNascChef = Calendar.getInstance();
        Calendar dataAdmissaoChef = Calendar.getInstance();
        Calendar dataPromocaoChef = Calendar.getInstance();
  
        dataNascChef.set(1989, Calendar.NOVEMBER, 20);
        dataAdmissaoChef.set(2015, Calendar.JANUARY, 26);
        dataPromocaoChef.set(2016, Calendar.FEBRUARY, 10);

        Pessoa chefedepartamento = new ChefeDepartamento("Pedro", "147.258.369-00", dataNascChef, "002406", dataAdmissaoChef, 5000, "RH", dataPromocaoChef, 2000);
        System.out.println(pessoa.toString()+"\n"+aluno.toString()+"\n"+funcionario.toString()+"\n"+ chefedepartamento.toString());
    }  
}