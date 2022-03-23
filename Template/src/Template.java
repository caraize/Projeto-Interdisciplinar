public class Template {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa("08732915896","Luis","Homem","1999",123,123333,"Rua blablabla","Jardins",
                "Luis123@gmail.com","Luis Zara","JogoVolei123");
        
        System.out.println(p.toString());
        
        Agenda a = new Agenda("08732915896","15:36","16:00","Luis","Fabio");
        System.out.println(a.toString());
        
        Mensalidade m = new Mensalidade("08732915896",155.50,"Fevereiro","05/02/2022");
        System.out.println(m.toString());
        
        Medidas n = new Medidas ( 75.5, 1.80, 25.5, 22.8, 80.5, 83.7, 92.1, 44.2, 44.1, 11.21,"08732915896");
        System.out.println(n.toString());
        
    }
    
}