package animal;

public class animais {
    private String nome;
// Construtor da classe Animal que inicializa  nome
public animais(String nome) {
this.nome = nome;
}

// Método para simular o ato de comer
public void comer() {
System.out.printf("%s comeu\n", nome);
}
// Método para simular o ato de beber
public void beber() {
System.out.printf("%s bebeu\n", nome);
}
// Método getter para obter o nome do animal
public String getNome() {
return nome;
}
// Método setter para definir o nome do animal
public void setNome(String nome) {
this.nome = nome;
}
}
