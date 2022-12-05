package actividad2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Medeles
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista tarea = new Lista();
        int opcion = 0, el;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                            1.(A) Agregar un Elemento al Inicio
                                                                            2.(B) Mostrar Datos de la Lista
                                                                            3.(C) Mostrar Longitud de la Lista 
                                                                            4.(D) Eliminar Ultimo Elemento de la Lista 
                                                                            5.(E) Ordenar Elementos de la Lista 
                                                                            6.Salir"""));
                switch (opcion) {
                    case 1:
                        try {
                        el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Elemento:", "Insertando Inicio", 3));
                        tarea.agregarInicio(el);
                    } catch (NumberFormatException n) {
                        JOptionPane.showInputDialog(null, "Error" + n.getMessage());
                    }
                    break;
                    case 2:
                        tarea.mostrarLista();
                        break;
                    case 3:
                        tarea.imprimirTamanoLista();
                        break;
                    case 4:
                        el = tarea.borrardelfinal();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es:" + el + "Eliminado del final");
                        break;
                    case 5:
                        tarea.ordenar();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Hasta Luego");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showInputDialog(null, "Error" + e.getMessage());
            }
        } while (opcion != 6);
    }

}
