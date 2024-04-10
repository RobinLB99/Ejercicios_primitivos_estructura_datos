import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        /**
         * Ejercios de datos primitivos
         */

        Primitivo primitivo = new Primitivo();

        // Ejercicio 1
        System.out.println("\n1. Programa para sumar, restar, multiplicar y dividir dos numeros enteros");
        primitivo.resultado(5, 8, "sumar");
        primitivo.resultado(5, 8, "restar");
        primitivo.resultado(5, 8, "multiplicar");
        primitivo.resultado(5, 8, "dividir");

        // Ejercicio 2
        System.out.println("\n2. Programa para compara dos numeros flotantes");
        primitivo.compararFlotantes(47.14, 45.78);
        primitivo.compararFlotantes(5.3, 5.3);

        // Ejercicio 3
        System.out.println("\n3. Escribe un programa que calcule el factorial de un número entero.");
        primitivo.factorial(10);

        // Ejercicio 4
        System.out.println("\n4. Escribe un programa que calcule el área de un círculo dado su radio (usa Math.PI para el valor de pi).");
        primitivo.areaCirculo(5);

        // Ejercicio 5
        System.out.println("\n5. Escribe un programa que convierta grados Fahrenheit a Celsius.");
        primitivo.convertToCelcius(68);

        System.out.println("\n6. Escribe un programa que compare dos números enteros y devuelva true si son iguales y false si no lo son.");
        primitivo.isEquals(4, 5);
        primitivo.isEquals(8, 8);

        System.out.println("");
        primitivo.isVocal('a');

        /**
         * EJERCICIOS DE ARREGLOS ---------------------------------------
         */
        System.out.println("\n------------------------ \n" + "Ejercicios de arreglos \n" + "-------------------------");

        Arreglo arreglo = new Arreglo();
        // Ejercicio 1
        System.out.println("\n1. Programa para encontrar el numero mayor en un arreglo de números. \n ------------------------------------------");
        arreglo.encontrarMayor();

        // Ejercicio 2
        System.out.println("\n2. Programa invertir el arreglo de char \n ----------------");
        arreglo.invertirArrChar();



        /**
         * EJERCICIOS DE ARRAYLIST ---------------------------------------
         */
        System.out.println("\n------------------------ \n" + "Ejercicios de ARRAYLIST \n" + "-------------------------");
        EjercicioArrayList arraylistEjercicios = new EjercicioArrayList();

        // Ejercicio 1
        System.out.println("\n1. Escribe un programa que añada elementos a un ArrayList y luego los imprima. \n ------------------------------------------");
        ArrayList<String> listaArray = new ArrayList<>(Arrays.asList("String1", "String2", "String3"));
        arraylistEjercicios.addToArrayList(listaArray, "Hola mundo");

        // Ejercicio 2
        System.out.println("\n2. Escribe un programa que elimine un elemento específico de un ArrayList. \n ------------------------------------------");
        ArrayList<Integer> listaArray2 = new ArrayList<>(Arrays.asList(54, 74, 52, 73, 32, 21, 53));
        arraylistEjercicios.eliminarElementoEnArrayList(listaArray2, 5);



        /**
         * EJERCICIOS DE LINKEDLIST ---------------------------------------
         */
        System.out.println("\n------------------------ \n" + "Ejercicios de LINKEDLIST \n" + "-------------------------");
        LinkedListEjercicios linkedlistEjer = new LinkedListEjercicios();

        // Ejercicio 1
        System.out.println("\n1. Escribe un programa que inserte elementos en una LinkedList en una posición específica. \n ------------------------------------------");
        LinkedList<String> listaEnlazada = new LinkedList<>(
                Arrays.asList("String1", "String2", "String3", "String4")
        );
        String element = "Hola mundo";
        linkedlistEjer.addToLinkedList(listaEnlazada, element, 2);

        // Ejercicio 2
        System.out.println("\n2. Escribe un programa que elimine el primer y último elemento de una LinkedList. \n ------------------------------------------");
        LinkedList<Integer> listaEnlazada2 = new LinkedList<>(
                Arrays.asList(45, 78, 45, 32, 78, 54, 21, 36)
        );
        linkedlistEjer.deleteFirstLastElement(listaEnlazada2);
    }
}