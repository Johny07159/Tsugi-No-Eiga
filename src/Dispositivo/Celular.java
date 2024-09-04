package Dispositivo;

public class Celular extends informçoes {
public String sistemaoperacional;
public String getSistemaoperacional(){
    return sistemaoperacional;
}    
public Celular (String Marca, String modelo , String sistemaoperacional){
    super(Marca, modelo);
    this.sistemaoperacional = sistemaoperacional;
}
public void exibirCelular(){
    System.out.printf("Marca: %s\n", this.getMarca());
    System.out.printf("Modelo: %s\n", this.getModelo());
    System.out.printf("Sistema Operacional: %s\n", this.getSistemaoperacional());
 
}
}
