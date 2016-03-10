
/** Prova creazione di lista ordinata alfabeticamente con dati da tastiera
 * 
 * 6 /3/2016
 */
import java.util.Scanner;
class ListaOrd
{
  public static void main(String argv[])
  {
    Lista l = new Lista();
    String dato;
    Scanner sc = new Scanner(System.in);
System.out.println(" Digita stringa ($ per terminare ---> ");
dato = sc.nextLine();
while (!dato.equals("$") )
{   
    l.inserisci(dato);
    System.out.println(" Digita stringa ($ per terminare ---> ");
    dato = sc.nextLine();
}
    l.stampa();
  }
}
