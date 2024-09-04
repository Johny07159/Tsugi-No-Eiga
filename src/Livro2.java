public class Livro2 {
    private String titulo;
    private int numeros;
    //constructor
    public Livro2(String titulo , int numeros) {
        this.titulo = titulo;
        this.numeros = numeros;
    }
// metodo setter e getter
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getNumeros() {
        return numeros;
    }
    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }
    public void verificaPaginas() {
        if (numeros >= 10) {
            System.out.println("Livro com mais de 10 páginas.");
        } else {
            System.out.println("Livro com menos de 100 páginas.");
        }

    }
    public void mostrarTitulo() {
        System.out.println("Título do livro: " + this.titulo);
    }
   //Motodo main
public static void main(String[] args) {
        Livro2 livro = new Livro2("the end",15);
        livro.setTitulo("the end");
        livro.setNumeros(9);
        livro.mostrarTitulo();
        livro.verificaPaginas();
    }
}
