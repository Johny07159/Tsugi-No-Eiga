public class ContaBancaria {
    //Atributos
    private int numeros;
    private double saldo;

    public void  setContaBancaria(int numeros) {
        this.numeros = numeros;
    }
    
    public int getContaBancaria() {
        return numeros;
    }
    
    public void  setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }
    //Metodo main
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();
        cb.setContaBancaria(10000);
        cb.setSaldo(1000.0);
        System.out.println("Número da conta: " + cb.getContaBancaria());
        System.out.println("Saldo: " + cb.getSaldo());
    }
}
