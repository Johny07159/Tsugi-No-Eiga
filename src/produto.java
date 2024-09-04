public class produto {
    // Atributos 
    public String katana;
    public double valor;
    public int quantidade;
    // Construtor
    public produto(String katana, double valor, int quantidade ){
        this.katana = katana;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    // getter
    public String getKatana(){
        return katana;
    }
    public double getValor(){
        return valor;
    }
    public int getQuantidade(){
        return quantidade;
    }
    // main
    public static void main(String[] args) {
        // Criando um produto
        produto katana = new produto("Graveto????", 999.999, 1);
        // Mostrando os valores dos atributos
        System.out.println("Katana: " + katana.getKatana());
        System.out.println("Valor: " + katana.getValor());
        System.out.println("Quantidade: " + katana.getQuantidade());
    }
  
}
