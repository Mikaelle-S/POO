//Classe Hacker
public class Q04{
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();

        usuario1.login("@fulano","123456");
    
        usuario1.nomeUsuario = "@beltrano";
        usuario1.senha = "654321";
        usuario1.mostrarLogin();

    }
}