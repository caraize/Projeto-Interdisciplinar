

public class Medidas {

    
    private double peso;
    private double altura;
    private double brc_dir;
    private double brc_esq;
    private double peitoral;
    private double barriga;
    private double quadril;
    private double pern_dir;
    private double pern_esq;
    private double data_cad;
    private String userCPF;
    
    public Medidas (){}
    
    public Medidas(double peso, double altura, double brc_dir, double brc_esq, 
                    double peitoral, double barriga, double quadril, double pern_dir,
                    double pern_esq, double data_cad, String userCPF){
        
    this.peso= peso;
    this.altura = altura;
    this.brc_dir = brc_dir;
    this.brc_esq = brc_esq;
    this.peitoral = peitoral;
    this.barriga = barriga;
    this.quadril = quadril;
    this.pern_dir = pern_dir;
    this.pern_esq = pern_esq;
    this.data_cad = data_cad;
    this.userCPF = userCPF;
        
    }
        
    public double getPeso() {
        return peso;
    }

    
    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    public double getAltura() {
        return altura;
    }

    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public double getBrc_dir() {
        return brc_dir;
    }

    
    public void setBrc_dir(double brc_dir) {
        this.brc_dir = brc_dir;
    }

    
    public double getBrc_esq() {
        return brc_esq;
    }

    
    public void setBrc_esq(double brc_esq) {
        this.brc_esq = brc_esq;
    }

    
    public double getPeitoral() {
        return peitoral;
    }

    
    public void setPeitoral(double peitoral) {
        this.peitoral = peitoral;
    }

    
    public double getBarriga() {
        return barriga;
    }

    
    public void setBarriga(double barriga) {
        this.barriga = barriga;
    }

    
    public double getQuadril() {
        return quadril;
    }

    
    public void setQuadril(double quadril) {
        this.quadril = quadril;
    }

    
    public double getPern_dir() {
        return pern_dir;
    }

    
    public void setPern_dir(double pern_dir) {
        this.pern_dir = pern_dir;
    }

    
    public double getPern_esq() {
        return pern_esq;
    }

    
    public void setPern_esq(double pern_esq) {
        this.pern_esq = pern_esq;
    }

    
    public double getData_cad() {
        return data_cad;
    }

    
    public void setData_cad(double data_cad) {
        this.data_cad = data_cad;
    }

    
    public String getUserCPF() {
        return userCPF;
    }

   
    public void setUserCPF(String userCPF) {
        this.userCPF = userCPF;
    }

    @Override
    public String toString(){
        return "Medidas:" + "\n Peso= "+ peso+
                "\n Altura= " + altura+
                "\n Braço Direito= " + brc_dir+
                "\n Braço Esquerdo= " + brc_esq+
                "\n Peitoral= " + peitoral+
                "\n Barriga= " + barriga+
                "\n Quadril= " + quadril+
                "\n Perna Direita= " + pern_dir+
                "\n Perna Esquerda= " + pern_esq+
                "\n Data do Cadastro= " + data_cad+
                "\n Seu CPF= " + userCPF;
    }
    
    
    
    
    
    }
