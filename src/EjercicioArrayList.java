import java.util.ArrayList;

public class EjercicioArrayList {

    /**
     * Escribe un programa que añada elementos a un ArrayList y luego
     * los imprima.
     */
    public void addToArrayList(ArrayList<String> arr, String element) {
        System.out.println("Original: " + arr.toString());
        arr.add(element);
        System.out.println("Nuevo: " + arr.toString());
    }

    /**
     * Escribe un programa que elimine un elemento específico
     * de un ArrayList.
     */
    public void eliminarElementoEnArrayList(ArrayList<Integer> arraylist, int index) {
        System.out.println("Original: " + arraylist.toString());
        System.out.println("Elemento eliminado: " + arraylist.get(index));
        arraylist.remove(index);
        System.out.println("Nuevo: " + arraylist.toString());
    }
}
