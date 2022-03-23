public class Mensalidade {

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getData_pg() {
        return data_pg;
    }

    public void setData_pg(String data_pg) {
        this.data_pg = data_pg;
    }
    
    private String cpf;
    private double valor;
    private String mes;
    private String data_pg;
    
    public Mensalidade(){}
    public Mensalidade(String cpf, double valor, String mes, String data_pg){
        this.cpf = cpf;
        this.valor = valor;
        this.mes = mes;
        this.data_pg = data_pg;
    }

    @Override
    public String toString(){
        return "Mensalidade:"+ "\n CPF="+cpf+
                "\n Valor="+valor+
                "\n Mês="+mes+
                "\n Data de Pagamento="+data_pg;
    }
}

