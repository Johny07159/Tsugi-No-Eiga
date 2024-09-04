package Pessoa;

public class pessoa {
 private String nome;
private  int idade;
public pessoa( String nome , int idade ) {
    this.nome = nome;
     this.idade = idade;
    
}
public void resultadoPessoa() {
    System.out.printf("%sNome\n", nome);
    System.out.printf("%sIdade\n", idade);
}
public String getNome() {
    return nome;
}
public int getIdade() {
    return idade;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setIdade(int idade) {
    this.idade = idade;
}
}

