public class casa {
    String cimento; 
    String areia;
    String tijolo;
    // constructor 
    public casa(String cimento, String areia, String tijolo){
        this.cimento = cimento;
        this.areia = areia;
        this.tijolo = tijolo;
    }
    // metodo getters
    public String getCimento(){
        return cimento;
    }
public String getAreia(){
    return areia;
    }
 public String getTijolo(){
    return tijolo;
    }
    // metodo main 
    public static void main(String[] args) {
        //metodo do objeto da calsse casa definindo valores
        casa casa = new casa("cinza","madeira","marom");
        // exibir os valores
        System.out.println("Cimento: "+casa.getCimento());
        System.out.println("Areia: "+casa.getAreia());
        System.out.println("Tijolo: "+casa.getTijolo());
    }
 
}

