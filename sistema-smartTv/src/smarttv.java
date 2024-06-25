public class smarttv {


/* Vamos criar um exemplo de uma classe para representar um SmatTv onde:
 * 1- Ela tenha as caracteristica : ligada(boolean), canal (int)e volume(int).
 * 2- Nossa tv poderá ligar e desligar assim mudar o estado ligada.
 * 3- Nossa tv aumentará e diminuiara o volume sempre em +1 ou -1.
 * 4- Nossa tv poderá mudar de canal de 1 ou 1 definido o numero correspodente.
 */
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    
}
