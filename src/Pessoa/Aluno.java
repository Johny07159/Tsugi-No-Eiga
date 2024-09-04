package Pessoa;

public class Aluno extends pessoa{
    public String curso;
    public String getCurso() {
       return curso;
   }
    public Aluno(String nome, int idade,String curso) {
           super( nome, idade);
           this.curso = curso;  
    }
    public void resultadoAluno() {
    System.out.printf("Curso : %s \n", getCurso());
        System.out.printf("Idade: %s \n", getIdade());
        System.out.printf(" Aluno: %s\n", getNome());
    }
    
} 

