package ContaBancaria;

public class Contabancaria {
    public String numero;
    public double saldo;
public Contabancaria(String numero, double saldo) {
    this.numero = numero;
    this.saldo = saldo;
}
public String getNumero() {
    return numero;
}

public double getSaldo() {
    return saldo;
}

public void setNumero(String numero) {
    this.numero = numero;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}
public void exibirContaBancaria() {
    System.out.printf("Numero: %s\n", this.getNumero());
    System.out.printf("saldo : %.2f\n" ,this.getSaldo());
}
}