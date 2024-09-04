public class curso {
    // Atributos
  private String nome;
private int horas;
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
    public int getHoras(){
        return horas;
    }
    public static void main(String[] args) {
        // Instanciando um objeto do tipo curso
        curso curso = new curso();
        curso.setNome("Programador");
        curso.setHoras(40);
        System.out.println("Nome do curso: " + curso.getNome());
        System.out.println("Horas do curso: " + curso.getHoras());
    }
}
