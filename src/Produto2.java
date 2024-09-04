public class Produto2 {
    private String nome;
    private int quantidade;
//contrutor
public Produto2(String nome, int quantidade) {
    this.nome = nome;
    this.quantidade = quantidade;
    //Metodo getter e setter
}
    public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getQuantidade() {
    return quantidade;
}
public void setQuantidade(int quantidade) {
 if (quantidade>=12) {
    this.quantidade = quantidade;
 } else {System.out.println("Nao ha em estoque");
      this.quantidade = quantidade;
}
}
//Metodo main
public void exibirInformacoes(){
    System.out.println("Nome: " + nome);
    System.out.println("Quantidade: " + quantidade);
}
public static void main(String[] args) {
    Produto2 produto = new Produto2("Controle" , 12);
    produto.setNome("Contorle");
    produto.setQuantidade(10);
    produto.exibirInformacoes();
}
}

