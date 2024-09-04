public class joao {
    // Atributos
    private String nome;
    private int idade;
    private String hobbies;
    private String profissao;
    private String email;
    private double telefone;
    private String carro;
    private String endereço;
    private int salario;
    //Metodo setter e getter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(String idade) {
        this.idade = Integer.parseInt(idade);
    }
    public int getIdade() {
        return idade;
    }
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    public String getHobbies() {
        return hobbies;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
    public double getTelefone() {
        return telefone;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }
    public String getCarro() {
        return carro;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario(){
        return salario;
    }
    //Metodo main
    public static void main(String[] args) {
      // Instanciando um objeto do tipo Joao
        joao j1 = new joao();
        // Acessando os valores dos atributos do Joao
        j1.setNome("Joao");
        j1.setIdade("18");
        j1.setHobbies("Atleta Marcial , Gamer , Programador , Atleta de Musculaçao");
        j1.setProfissao("Desenvolvedor Java");
        j1.setEmail("joao@gmail.com");
        j1.setTelefone(1234567891);
        j1.setCarro("Nao possui");
        j1.setEndereço("Rua A, 123");
        j1.setSalario(10);
        System.out.println("Nome: " + j1.getNome());
        System.out.println("Idade: " + j1.getIdade());
        System.out.println("Hobbies: " + j1.getHobbies());
        System.out.println("Profissao: " + j1.getProfissao());
        System.out.println("Email: " + j1.getEmail());
        System.out.println("Telefone: " + j1.getTelefone());
        System.out.println("Carro: " + j1.getCarro());
        System.out.println("Endereço: " + j1.getEndereço());
        System.out.println("Salario: " + j1.getSalario() + " Bilhoes");
    }
}
