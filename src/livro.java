public class livro {
    //atributos
    String titulo;
    String autor;
    double folhas;
    int paginas;
    // construtor

    public livro(String titulo, String autor, double folhas, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.folhas = folhas;
        this.paginas = paginas;
    }
    // método getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public double getFolhas() {
        return folhas;
    }
    public int getPaginas() {
        return paginas;
    }
    // main
    public static void main(String[] args) {
        livro livro1 = new livro("The end", "Miguel de Cervantes", 336.0, 300);
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Folhas: " + livro1.getFolhas());
        System.out.println("Páginas: " + livro1.getPaginas());
    }
}