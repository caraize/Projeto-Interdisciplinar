
public class Agenda {


private String cpf;
private String dataInicio;
private String dataFinal;
private String prof;
private String cliente;

public Agenda(){}

public Agenda(String cpf, String dataInicio, String dataFinal, String prof, String cliente){
    this.cpf= cpf;
    this.dataInicio = dataInicio;
    this.dataFinal = dataFinal;
    this.prof = prof;
    this.cliente = cliente;
}


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getDataInicio() {
        return dataInicio;
    }


    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }


    public String getDataFinal() {
        return dataFinal;
    }


    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }


    public String getProf() {
        return prof;
    }


    public void setProf(String prof) {
        this.prof = prof;
    }


    public String getCliente() {
        return cliente;
    }


    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
public String toString(){
    return "Agenda: " + "\n CPF= "+ cpf+
            "\n Data do início= " + dataInicio+
            "\n Data do fim= " +dataFinal+
            "\n Professor= " + prof +
            "\n Cliente= = "+cliente ;
}

}


