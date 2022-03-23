
public class Pessoa {

private String cpf;
private String nome;
private String sexo;
private String nasc;
private int fone;
private int cep;
private String rua;
private String bairro;
private String email;
private String login;
private String senha;


//construtor sem parametro
public Pessoa () {}


//construtor com parametro

public Pessoa(String cpf, String nome, String sexo, String nasc, int fone, int cep, String rua, String bairro, String email, String login, String senha) {

this.cpf = cpf;
this.nome = nome;
this.sexo = sexo;
this.nasc = nasc;
this.fone = fone;
this.cep = cep;
this.rua = rua;
this.bairro = bairro;
this.email = email;
this.login = login;
this.senha = senha;
}

public boolean validar(){
    if(!(login.equals(" ")|| senha.equals(" ")))
        return true;
    else
        return false;}
//get & set
public String getCpf(){
return cpf;
}

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNas(String nasc) {
        this.nasc = nasc;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
  }
 
@Override
public String toString(){
    return "Pessoa: " + "\n Nome= " + nome +
            "\n CPF= "+ cpf+
            "\n Sexo= "+ sexo+
            "\n Data de Nascimento= "+nasc+
            "\n Fone= " + fone +
            "\n CEP= "+cep+
            "\n Logradouro= "+rua+
            "\n Bairro= "+bairro+
            "\n Email= "+email+
            "\n Login= "+login+
            "\n Senha= "+senha ;
}
}
