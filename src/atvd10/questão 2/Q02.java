/*
 * 2. Considerando o código das classes Transporte, Terrestre e Automóvel apresentados
 * na Figura abaixo, finalize a implementação delas, adicionando os métodos get() e
 * set() para cada um de seus atributos. Em seguida, crie uma classe Principal com um
 * método main() que cria um objeto da classe Automóvel, e chama todos os métodos
 * set() e get() criados, inclusive das classes Transporte e Terrestre. Observe no seu
 * exemplo, que é possível chamar todos os métodos get() e set() herdados pela
 * classe Automóvel.
 */
public class Q02{
    public static void main(String[] args) {
        Automovel moto = new Automovel();
  
        moto.setCapacidade(2);
        moto.setNumRodas(2);
        moto.setNumPortas(0);
        moto.setCor("Preto");
        moto.setPlaca("XYZ-123");
        
        System.out.println(moto.toString());
    }
}