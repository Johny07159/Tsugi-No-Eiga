public class cidade {
    //Atibutos 
    private String cidade;
    private int populacao;

  public void setCidade(String cidade) {
    this.cidade = cidade;
 }
  public String getCidade() {
    return cidade;
  }
  public void setPopulacao(int populacao) {
    this.populacao = populacao;
  }
public int getPopulacao() {
    return populacao;
  }
  //Método main para testar a classe Cidade
  public static void main(String[] args) {
    //Instanciando um objeto do tipo Cidade
    cidade cidade1 = new cidade();
    //Atribuindo valores aos atributos
    cidade1.setCidade("São Paulo");
    cidade1.setPopulacao(11);
    //Imprimindo os valores dos atributos
    System.out.println("Cidade: " + cidade1.getCidade());
    System.out.println("População: " + cidade1.getPopulacao() + " milhões");
  }
}