package ContaBancaria;

public class ContaCorrente extends Contabancaria{
private double limite;
private double getLimite() {
return limite;
}
    
public ContaCorrente(String numero, double saldo , double limite){
super(numero, saldo);
            this.limite = limite;
 }
 public void resultadoContaCorrente() {
 System.out.printf("Numero: %s\n " , this.getNumero());
 System.out.printf("Saldo: %.2f\n " , this.getSaldo());
  System.out.printf("Limite: %.2f\n " , this.getLimite());

        }
    }

    


