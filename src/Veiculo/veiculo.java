package Veiculo;

public class veiculo {
    public String Marca;
    public int ano;

    public veiculo(String marca, int ano) {
        this.Marca = marca;
        this.ano = ano;
    }
    public String getMarca() {
        return Marca;
    }
    public int getAno() {
        return ano;
    }
    public void setMarca(String marca) {
        this.Marca = marca;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void exibirVeiculo(){
        System.out.printf("Marca: %s\n", this.getMarca());
        System.out.printf("Ano: %d\n" ,this.getAno());
    }

    
}
