public class filme {
 // atributos da calsse
        String titulo;
        String diretor;
        String ator;
        String genero;
// construtor da classe
public filme(String titulo, String diretor, String ator, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ator = ator;
        this.genero = genero;
}
// metodo getters para acessar os atributos
public String getTitulo(){
        return titulo;
    }
public String getDiretor(){
        return diretor;
    }
public String getAtor(){
        return ator;
    }
public String getGenero(){
        return genero;
    }
// metodo main para criar um objeto e definir os valores dos atributos
public static void main(String[] args) {
        filme filme1 = new filme("The Shawshank Redemption", "Francis Ford Coppola", "Frank Darabont", "Drama");
        System.out.println("Titulo: " + filme1.getTitulo());
        System.out.println("Diretor: " + filme1.getDiretor());
        System.out.println("Ator: " + filme1.getAtor());
        System.out.println("Genero: " + filme1.getGenero());
    }
}

