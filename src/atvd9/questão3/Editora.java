public class Editora {
    private String editora;
    
    public Editora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return editora;
    }
    @Override
    public String toString() {
        return String.format("Editora: %s\n",editora);
    }
}