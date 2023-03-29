/*
 * 9. Implemente as classes da hierarquia da classe FiguraGeometrica mostrada na
 * Figura abaixo em Java, aplicando o polimorfismo de sobreposição para o método
 * desenha(). Em seguida, crie uma classe Principal com um método main que cria um
 * objeto de cada uma das classes e chama seus respectivos métodos desenha().
 */
public class Q09 {
    public static void main(String [] args){
        FiguraGeometrica circulo = new Circulo();
        FiguraGeometrica quadrado = new Quadrado();
        FiguraGeometrica triangulo = new Triangulo();
        FiguraGeometrica trianguloEquilatero = new TrianguloEquilatero();

        circulo.desenhar();
        quadrado.desenhar();
        triangulo.desenhar();
        trianguloEquilatero.desenhar();
    }
}
