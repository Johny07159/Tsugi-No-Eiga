package Dispositivo;

public class Laptop extends informçoes {
public int memoriaRam;
public int getMemoriaRam(){
return memoriaRam;    

}
public Laptop (String marca , String modelo , int memoriaRam) {
    super(marca, modelo);
    this.memoriaRam = memoriaRam;
}
 
public void exibirLaptop(){
    System.out.printf("Marca: %s\n", getMarca());
    System.out.printf("Modelo: %s\n", this.getModelo());
    System.out.printf("Sistema Operacional: %d\n", this.getMemoriaRam());
}
}
