public class Pessoa1 {
//atributos
private String nome;
private int idade;
private String endereço;
private double telefone;
private String email;
private String sexo;
private String EstadoCivil;
private double cpf;
private String profissão;
private double salario;
private String nacionalidade;
private String Filhos;
//construtor

public Pessoa1(String nome, int idade, String endereço, double telefone, 
String email, String sexo, String EstadoCivil, double cpf, 
String profissão, double salario, String nacionalidade, String Filhos) {
    this.nome = nome;
    this.idade = idade;
    this.endereço = endereço;
    this.telefone = telefone;
    this.email = email;
    this.sexo = sexo;
    this.EstadoCivil = EstadoCivil;
    this.cpf = cpf;
    this.profissão = profissão;
    this.salario = salario;
    this.nacionalidade = nacionalidade;
    this.Filhos = Filhos;
}
//getters e setters
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}
public String getEndereço() {
    return endereço;
}
public void setEndereço(String endereço) {
    this.endereço = endereço;
}
public double getTelefone() {
    return telefone;
}
public void setTelefone(double telefone) {
    this.telefone = telefone;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getSexo() {
    return sexo;
}
public void setSexo(String sexo) {
    this.sexo = sexo;
}
public String getEstadoCivil() {
    return EstadoCivil;
}
public void setEstadoCivil(String estadoCivil) {
    this.EstadoCivil = estadoCivil;
}
public double getCpf() {
    return cpf;
}
public void setCpf(double cpf) {
    this.cpf = cpf;
}
public String getProfissão() {
    return profissão;
}
public void setProfissão(String profissão) {
    this.profissão = profissão;
}
public double getSalario() {
    return salario;
}
public void setSalario(double salario) {
    this.salario = salario;
}
public String getNacionalidade() {
    return nacionalidade;
}
public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
}
public String getFilhos() {
    return Filhos;
}
public void setFilhos(String filhos) {
    this.Filhos = filhos;

    if (idade >= 18) {
        System.out.println("Pessoa pode realizar pagamentos.");
    } 
    else {
        System.out.println("Pessoa não pode realizar pagamentos.");
    }
    if (profissão == "Engenheiro") {
        System.out.println("Pessoa é um engenheiro.");
    }
    else {
        System.out.println("Pessoa não é um engenheiro.");
    }
    if (salario >= 5000) {
        System.out.println("Pessoa possui salário superior a 5000.");
    }
    else {
        System.out.println("Pessoa não possui salário superior a 5000.");
    }
    if (sexo == "Masclino") {
        System.out.println("Pessoa é Masculino.");
    }
    else {
        System.out.println("O sexo da pessoa nao e Masculino.");
    }
    if (filhos == "Um") {
        System.out.println("Pessoa tem um filho.");
    }
    else {
        System.out.println("Pessoa não tem um filho.");
    }
    if (EstadoCivil == "Casado") {
        System.out.println("Pessoa está casada.");
    }
    else {
        System.out.println("Pessoa não está casada.");
    }
}
    //Metodo main
       public static void main(String[] args) {
        Pessoa1 eu = new Pessoa1
        ("João", 
        18, 
        "Rua 1", 
        987654321, 
        "joao@email.com", 
        "Masculino", 
        "Casado", 1234567890, 
        "Engenheiro", 
        5000.0, 
        "Brasileiro", 
        "Um");
        eu.setNome("joao");
        eu.setIdade(18);
        eu.setEndereço("Rua 1");
        eu.setTelefone(987654321);
        eu.setEmail("joao@email.com");
        eu.setSexo("Masculino");
        eu.setEstadoCivil("casado");
        eu.setCpf(1234567890);
        eu.setProfissão("Engenheiro");
        eu.setSalario(5000);
        eu.setFilhos("Um");
        eu.setNacionalidade("Brasileiro");


     }
}



