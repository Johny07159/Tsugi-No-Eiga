public class computador {
    // Atributos da classe
    double memoria;
    String placadevideo;
    int cabos;
    String gabinete;
// construtor da classe
public computador(double memoria, String placadevideo, int cabos, String gabinete){
    this.memoria = memoria;
    this.placadevideo = placadevideo;
    this.cabos = cabos;
    this.gabinete = gabinete;
}
// metodo getters
public double getMemoria(){
    return memoria;
}
public String getPlacavideo(){
    return placadevideo;
}
public int getCabos(){
    return cabos;
}
public String getGabinete(){
    return gabinete;
}
// metodo main
public static void main(String[] args){
    computador computador1 = new computador(320, "Geforce GTX 4060", 2, "GAMER");
    System.out.println("Memória: " + computador1.getMemoria() + " GB");
    System.out.println("Placa de Vídeo: " + computador1.getPlacavideo());
    System.out.println("Cabos de Lâmpada: " + computador1.getCabos());
    System.out.println("Gabinete: " + computador1.getGabinete());
}
}
