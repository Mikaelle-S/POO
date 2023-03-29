public class Contato {
    private String telefoneResid;
    private String celular;
    private String email;

    public Contato(String telefoneResid,String celular,String email){
        this.telefoneResid = telefoneResid;
        this.celular = celular;
        this.email = email;
    }
    public String getTelefoneResid() {
        return telefoneResid;
    }
    public String getCelular() {
        return celular;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return String.format("Telefone Residencial: %s\nCelular: %s\nEmail: %s\n",telefoneResid,celular,email);
    }
}
