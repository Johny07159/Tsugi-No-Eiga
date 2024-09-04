

public class carro {
    //atributos da classe carro
private String cor;
private String modelo;
private String marca;

//  //metodo construtor da classe carro
    public carro(String cor, String modelo, String marca){
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
    }
//  //metodo getters para acessar os atributos dessa classe

public carro() {
    }

public String getCor(){
    return cor;
}
public String getModelo(){
    return modelo;
}
 public String getMarca(){
    return marca;
} 
void acelerar(){
    System.out.println("O carro esta acelerando.");
}
void frear(){
    System.out.println("O carro esta freando.");
}
void virar(String direcao){
    System.out.println("O carro esta virando para " + direcao +".");
}
void Drift(){
    System.out.println(" O carro esta dando drift.");
} 
void cambio(){
    System.out.println("O carro esta trocando o cambio.");
}

public static void main(String[] args) throws Exception {
    carro GTR34 = new carro();
    GTR34.cor="branco";
    GTR34.marca="Nissa";
    GTR34.modelo="R34";
    GTR34.acelerar();
    GTR34.Drift();
    GTR34.cambio();
    System.out.println("A cor do carro e :"+GTR34.getCor());
    System.out.println("A marca do carro e :"+GTR34.getMarca()); 
    System.out.println("O modelo do carro e :"+GTR34.getModelo()); 
  }
}
