package animal;

public class gato extends animais {
    // Construtor da classe Gato que chama o construtor da classe pai (Animal)
    public gato(String nome) {
    super(nome); // Chama o construtorda classe Animal para inicializar o nome
    }
    
    // Método para simular o ato de miar
    public void miar() {
    // Imprime uma mensagem indicando que o gato miou
    System.out.printf("%s miou\n",getNome());
    }
    }


