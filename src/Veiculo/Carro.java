package Veiculo;

public class Carro extends veiculo{
public int numPortas;
public int getnumPortas(){
    return numPortas;    
}
public Carro (String marca , int ano , int numPortas){
    super(marca, ano);
    this.numPortas = numPortas;
}

public void exibirCarro(){
    System.out.printf("Marca: %s\n", getMarca());
    System.out.printf("Ano: %d\n", getAno());
    System.out.printf("Numero de Portas: %d\n", getnumPortas());
}
}
