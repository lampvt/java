
/** Prova creazione di lista ordinata alfabeticamente
 * 
 * 4 /3/2016
 */

class ListaProg
{
  public static void main(String argv[])
  {
    Lista l = new Lista();

    l.inserisci("romeo");
    l.inserisci("amato");
    l.inserisci("donato");
    l.inserisci("schillaci");
    l.inserisci("marchese");
    l.stampa();
  }
}
