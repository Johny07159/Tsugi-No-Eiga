package Dispositivo;

public class informçoes {
    private String marca;
    private String modelo;

    public informçoes(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    
}
public String getMarca() {
    return marca;
}

public String getModelo() {
    return modelo;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}
public void exibirinformaçoes() {
    System.out.printf("Marca: %s\\n", this.getMarca());
    System.out.printf("Modelo: %s\\n", this.getModelo());
}
}