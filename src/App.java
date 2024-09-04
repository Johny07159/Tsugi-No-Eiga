import Dispositivo.Laptop;
import Dispositivo.Celular;


public class App {
    public static void main(String[] args) throws Exception{
        Celular celular= new Celular ("Motorola" , "S13" , "Apple iOS" );
        celular.exibirCelular();
        Laptop laptop = new Laptop("samsung", "i7" , 16);
        laptop.exibirLaptop();
       
    }
}    

