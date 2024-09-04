public class Filme2 {
    //Atributos
    private String titulo;
    private int classificacao;
    // contrutor 
    public Filme2(String titulo, int classificacao) {
        this.titulo = titulo;
        this.classificacao = classificacao;}
    // getters and setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    public String getTitulo() {
        return titulo;
    }
     public int getClassificacao() {
        return classificacao;
    }
    public void mostrarClassificacao() {
        System.out.println("Classificacao do Filme: " + this.classificacao);
    }
     public void mostrarTitulo() {
        System.out.println("Titulo do Filme: " + this.titulo);
    }
    public void verificarClassificacao() {
        if (classificacao >=18 ) {
            System.out.println("Esse filme e permitido para maiores de 18");
        } 
        else {
            System.out.println("Esse filme e proibido para menores de 18");
        }
    }
 //Metodo main
 public static void main(String[] args) {
    Filme2 filme = new Filme2("Matrix", 18);
    filme.mostrarTitulo();
    filme.mostrarClassificacao();
    filme.verificarClassificacao();
 }
}

