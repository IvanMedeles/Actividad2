package actividad2;

/**
 *
 * @author Ivan Medeles
 */
public class Lista {

    protected Nodo inicio, fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public void agregarInicio(int elemento) {
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    public void mostrarLista() {
        Nodo recorrer = inicio;
        System.out.println();
        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]-->");
            recorrer = recorrer.siguiente;
        }
    }

    public void imprimirTamanoLista() {
        int cantidad = 0;
        Nodo recorrer = inicio;
        System.out.println();
        while (recorrer != null) {
            cantidad++;
            recorrer = recorrer.siguiente;

        }
        System.out.println("La Cantidad de Nodos es:" + cantidad);
    }

    public int borrardelfinal() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.siguiente != fin) {
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return elemento;
    }

    public boolean buscar(int elemento) {
        Nodo temporal = inicio;
        while (temporal != null && temporal.dato != elemento) {
            temporal = temporal.siguiente;
        }
        return temporal != null;
    }

    public void ordenar() {
        int t = 1, c = 1;
        Nodo act = inicio;
        while (act.siguiente != null) {
            act = act.siguiente;
            c++;
        }
        int tem = 0;
        String tem1 = "";
        do {
            act = inicio;
            Nodo sig = act.siguiente;
            while (act.siguiente != null) {
                if (act.dato > sig.dato) {
                    tem = act.dato;
                    act.dato = sig.dato;
                    sig.dato = tem;
                    act = act.siguiente;
                    sig = sig.siguiente;
                } else {
                    act = act.siguiente;
                    sig = sig.siguiente;
                }
            }
            t++;
        } while (t <= c);
    }
}
