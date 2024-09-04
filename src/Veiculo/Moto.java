package Veiculo;

public class Moto extends veiculo{
    public int  cilindradas;
    public int getCilindradas() {
        return cilindradas;
    }
    public Moto (String marca , int ano , int  cilindradas){
super(marca, ano);
this.cilindradas = cilindradas;
}

public void exibirMoto(){
    System.out.printf("Marca: %s\n", getMarca());
    System.out.printf("Ano: %d\n", getAno());
    System.out.printf("Cilindradas: %d\n", getCilindradas());
}
}