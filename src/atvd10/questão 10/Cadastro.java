/* 
 * 10. Implemente o diagrama de classes representado pela Figura abaixo. Para a classe
 * CadastroPessoas considere o atributo pessoas como um array do tipo Pessoa.
 * O método cadastrarPessoa(): deve acrescentar ao arraypessoas um objeto
 * descendente da classe Pessoa.
 * O método mostraCadastro(): deve percorrer todo o array de pessoas e mostrar
 * todos os dados do descendente de Pessoa.
 * Aplique os tipos de polimorfismo em cada uma das situações solicitadas:
        * a. Polimorfismo de Sobrecarga: crie mais de um método construtor para cada
    * classe: Pessoa, Cliente, Funcionario e Gerente.
        * b. Polimorfismo de Sobreposição: faça com que o método mostraCadastro()
    * utilize o método mostraDados() correto, dependendo se a Pessoa é um
    * Cliente, Funcionario ou Gerente.
        * c. Polimorfismo de Inclusão: quando for adicionar ao arraypessoas uma nova
    * pessoa que pode ser de um dos tipos descendentes de Pessoa.
*/
import java.util.ArrayList;
import java.util.List;
public class Cadastro {
    public List<Pessoa> lista = new ArrayList<Pessoa>();

    public void cadastrarPessoa(Pessoa pessoa){
        lista.add(pessoa);
    }

    public void mostrarPessoa(){
        for(Pessoa pessoa:lista){
            System.out.println(pessoa.toString());
        }
    }
    public static void main(String [] args){
        Cadastro aplicacao = new Cadastro();
        Pessoa pessoa = new Pessoa("Ludmila", "123.456.789-00");
        Pessoa cliente = new Cliente("Jeffersson", "009.876.543-21", 123);
        Pessoa funcionario = new Funcionario("Pedro", "147.258.369-00", "192.05", 2500);
        Pessoa gerente = new Gerente("Natalia", "321.654.987-11", "1234", 9000, 1);
        aplicacao.cadastrarPessoa(pessoa);
        aplicacao.cadastrarPessoa(cliente);
        aplicacao.cadastrarPessoa(funcionario);
        aplicacao.cadastrarPessoa(gerente);
        aplicacao.mostrarPessoa();
    }
}
