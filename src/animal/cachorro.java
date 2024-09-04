package animal;
public class cachorro extends animais {
public cachorro(String nome) {
 super(nome); }
public void latir() {
 System.out.printf("%s latiu\n",getNome()); }
public void lamber() {
System.out.printf("%s lambeu\n",getNome());
        }
}
