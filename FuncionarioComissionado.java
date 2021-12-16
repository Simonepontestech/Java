package ExercicioUni1;

public class FuncionarioComissionado {
    private String nome;
    private int cpf;
    private float percentualSobVendas;
    private float totalVendas;


    public FuncionarioComissionado(String nome, int cpf, float percentualSobVendas, float totalVendas) {
        this.nome = nome;
        this.cpf = cpf;
        this.percentualSobVendas = percentualSobVendas;
        this.totalVendas = totalVendas;
    }

    public float getSalario(){
        float salario = (this.getTotalVendas()*this.getPercentualSobVendas())/100;
        return salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public float getPercentualSobVendas() {
        return this.percentualSobVendas;
    }

    public void setPercentualSobVendas(float percentualSobVendas) {
        this.percentualSobVendas = percentualSobVendas;
    }

    public float getTotalVendas() {
        return this.totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

}
