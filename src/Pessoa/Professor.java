package Pessoa;

public class Professor extends pessoa{
    public String diciplina;
    public String getDiciplina(){ 
    return diciplina;
}
public Professor(String nome , int idade , String diciplina){
    super(nome, idade);
    this.diciplina = diciplina;
}
public void resultadoProferros() {
    System.out.printf(" diciplina: %s\n", getDiciplina());
    System.out.printf(" Professor: %s\n", getNome());
    System.out.printf(" idade: %s\n", getIdade());
}

}

