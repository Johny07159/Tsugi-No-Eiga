public class Pessoa {
// Atributos privados
    private String nome;
    private int idade;
    // Construtor
    public Pessoa(String nome, int idade) 
    { this.nome = nome;
    this.idade = idade;
    }
    // Métodos públicos para acessar e modificar os atributos
    public String getNome() {
    return nome;
    }
    public void setNome(String nome) {
    this.nome = nome;
    }
    public int getIdade() {
    return idade;
    }
    public void setIdade(int idade) {
    // Podemos adicionar lógica para validação
    if (idade >= 10) {
        System.out.println("Idade invalida! Idade nao pode ser negativa.");

    } else {System.out.println("Idade inválida! Idade não pode ser negativa.");
    }
    }
    // Método para exibir as informações da pessoa
    public void exibirInformacoes() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
    }
    // Método principal para testar a classe
    public static void main(String[] args) {
    // Criação de um objeto Pessoa
    Pessoa pessoa = new Pessoa("Joao", 9);
    pessoa.setIdade(9);
    pessoa.setNome("joao");
    pessoa.exibirInformacoes();
    }
}
    

