public class Usuario{
    //public para ter acesso 
    private String nomeUsuario, senha;

    public void login(String nomeUsuario, String senha){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public void mostrarLogin(){
        System.out.println("__________________");
        System.out.println(" Login ");
        System.out.println("__________________");
        System.out.printf("Usuario: %s\nSenha: %s\n",nomeUsuario,senha);
        System.out.println("__________________");
    }
}