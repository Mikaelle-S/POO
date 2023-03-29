public class CModern extends CBasic{
    private boolean isFoto;
    private boolean isAplicativos;
    private boolean isMp3;

    public CModern(String marca, String cor, String modelo, boolean isFoto, boolean isAplicativos, boolean isMp3) {
        super(marca, cor, modelo);
        this.isFoto = isFoto;
        this.isAplicativos = isAplicativos;
        this.isMp3 = isMp3;
    }

    public boolean isFoto() {
        return isFoto;
    }

    public void setFoto(boolean isFoto) {
        this.isFoto = isFoto;
    }

    public boolean isAplicativos() {
        return isAplicativos;
    }

    public void setAplicativos(boolean isAplicativos) {
        this.isAplicativos = isAplicativos;
    }

    public boolean isMp3() {
        return isMp3;
    }

    public void setMp3(boolean isMp3) {
        this.isMp3 = isMp3;
    }

    @Override
    public String toString() {
        return "Celular Moderno [cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + ", isAplicativos=" + isAplicativos + ", isFoto=" + isFoto + ", isMP3=" + isMp3 + "]";
    }
}
