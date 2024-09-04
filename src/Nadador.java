public class Nadador {
    //stats do Nadador
    public String nome;
    int idade;

// constructor de classe
  public Nadador(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
  //metodo getters para acessar os atributos dessa classe
 public
  String getNome(){
    return nome;
  }
  public int getIdade(){
    return idade;
  }
  // metodo main para criar classe objetos e definir os valores do atributos
  public static void main(String[] args) {
    // criando um objeto Nadador chamado nadador1 e atribuindo valores aos atributos
    Nadador nadador1 = new Nadador("João",18);
    // imprimindo os valores dos atributos do nadador1
    System.out.println("Nome: " + nadador1.getNome());
    System.out.println("Idade: " + nadador1.getIdade());
  }
  }
