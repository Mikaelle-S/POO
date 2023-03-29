/*
 * 6. Crie uma classe Carro.java adicionando atributos, como marca, modelo, ano de
 * fabricação, tipo de combustível (álcool, gasolina ou flex). Crie arquivo Main.java
 * para definir e exibir os novos atributos
 */
public class Q06{
    public static void main(String[] args) {
        //Ex.:1
        Carro carro1 = new Carro("Nissan","Kicks","Gasolina",2018);
        //Ex.:2
        Carro carro2 = new Carro("Renault","Duster","Flex",2020);

        System.out.println("---------CARRO---------");
        System.out.printf("MARCA: %s\nMODELO: %s\nTIPO DE COMBUSTIVEL: %s\nANO:  %d\n",carro1.getMarca(),carro1.getModelo(),carro1.getTipoCombustivel(),carro1.getAno());
        System.out.println("---------CARRO---------");
        System.out.printf("MARCA: %s\nMODELO: %s\nTIPO DE COMBUSTIVEL: %s\nANO:  %d\n",carro2.getMarca(),carro2.getModelo(),carro2.getTipoCombustivel(),carro2.getAno());
        

    }
}