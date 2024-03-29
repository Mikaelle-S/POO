import java.util.Calendar;
public class ChefeDepartamento extends Funcionario {
    private String departamento;
    private Calendar dataPromocao;
    private float gratificacao;

    public ChefeDepartamento(String nome, String cpf, Calendar dataNasc, String matricula, Calendar dataAdmissao, float salario, String departamento, Calendar dataPromocao, float gratificacao) {
        super(nome,cpf,dataNasc,matricula,dataAdmissao,salario);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public Calendar getDataPromocao() {
        return dataPromocao;
    }
    public void setDataPromocao(Calendar dataPromocao) {
        this.dataPromocao = dataPromocao;
    }
    public float getGratificacao() {
        return gratificacao;
    }
    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }
    @Override
    public String toString() {
        return "ChefDepartamento [cpf=" + cpf + ", dataNasc=" + dataNasc.get(Calendar.DAY_OF_MONTH) + "/" + dataNasc.get(Calendar.MONTH) + "/" + dataNasc.get(Calendar.YEAR) + ", nome=" + nome + ", dataAdmissao=" + dataAdmissao.get(Calendar.DAY_OF_MONTH) + "/" + dataAdmissao.get(Calendar.MONTH) + "/" + dataAdmissao.get(Calendar.YEAR) + ", matricula=" + matricula + ", salario=" + salario + ", dataPromocao=" + dataPromocao.get(Calendar.DAY_OF_MONTH) + "/" + dataPromocao.get(Calendar.MONTH) + "/" + dataPromocao.get(Calendar.YEAR)  +", departamento=" + departamento + ", gratificacao=" + gratificacao + "]";
    }  
}
