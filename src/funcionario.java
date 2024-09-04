public class funcionario {
    private String nome;
    private double salario;
     
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    //Metodo main
    public static void main(String[] args) {
        // Instanciando um objeto do tipo funcionario
        funcionario f1 = new funcionario();
        // Acessando os valores dos atributos do funcionario
        f1.setNome("Joao");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salario: " + f1.getSalario()+ " Bilhoes");
    }
    
}
