package ContaBancaria;

public class Contapoupança extends Contabancaria {
    private double taxadejuros;
    private double getTaxadejuros() {
        return taxadejuros;
    }
public Contapoupança(String numero , double saldo, double taxadejuros) {
    super(numero,saldo);
    this.taxadejuros = taxadejuros;
}

public void resultadoContapoupança(){
    System.out.printf( "Numero: %s\n", this.getNumero());
    System.out.printf( "Saldo: %.2f\n",this.getSaldo());
    System.out.printf("taxaDeJuros: %.2f\n",this.getTaxadejuros());
   
}
}


