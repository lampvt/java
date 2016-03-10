
/**
 *  classe Nodo di una lista concatenata di stringhe
 * 
 */
class Nodo
{
  private String dato;
  private Nodo successivo;

  public Nodo(String dato)
  {
    this.dato = dato;
    successivo = null;
  }

  public void setSuccessivo(Nodo succ)
  {
    successivo = succ;
  }

  public Nodo getSuccessivo()
  {
    return successivo;
  }

  public String getDato()
  {
    return dato;
  }
}
