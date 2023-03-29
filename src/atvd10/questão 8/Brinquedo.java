public class Brinquedo {
    private String nome;
    private float velocidade;
    private float aceleracao;

    public Brinquedo(){

    }
    public Brinquedo(String nome, float velocidade, float aceleracao){
        this.nome = nome;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }
    public void mover(Brinquedo brinquedo){
        System.out.println("O brinquedo " + brinquedo.getNome() + " esta movimentando");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    public float getAceleracao() {
        return aceleracao;
    }
    public void setAceleracao(float aceleracao) {
        this.aceleracao = aceleracao;
    }
}
