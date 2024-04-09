import java.util.LinkedList;

public class LinkedListEjercicios {

    /**
     * Escribe un programa que inserte elementos en una LinkedList
     * en una posición específica.
     */
    public void addToLinkedList(LinkedList<String> lista, String element, int index) {
        System.out.println("Original: " + lista.toString());
        lista.add(index, element);
        System.out.println("Nuevo: " + lista.toString());
    }

    /**
     * Escribe un programa que elimine el primer y último elemento
     * de una LinkedList.
     */
    public void deleteFirstLastElement(LinkedList<Integer> lista) {
        System.out.println("Original: " + lista.toString());
        System.out.println("Primero: " + lista.getFirst() + " | Ultimo: " + lista.getLast());
        lista.removeFirst();
        lista.removeLast();
        System.out.println("Primero y ultimo eliminado: " + lista.toString());
    }
}
