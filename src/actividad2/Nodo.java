package actividad2;

/**
 *
 * @author Ivan Medeles
 */
public class Nodo {

    public int dato;
    public Nodo siguiente;

    public Nodo(int d) {
        this.dato = d;
    }

    public Nodo(int d, Nodo n) {
        dato = d;
        siguiente = n;
    }

}
