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

        // Ejercicio 6
        System.out.println("\n6. Escribe un programa que compare dos números enteros y devuelva true si son iguales y false si no lo son.");
        primitivo.isEquals(4, 5);
        primitivo.isEquals(8, 8);

        // Ejercicio 7
        System.out.println("\n7. Escribe un programa que verifique si un carácter es una vocal o una consonante.");
        primitivo.isVocal('a');
        primitivo.isVocal('b');

        // Ejercicio 8
        System.out.println("\n8. Escribe un programa que calcule la raíz cuadrada de un número (usa Math.sqrt()).");
        primitivo.raizCuadrada(51);

        // Ejercicio 9
        System.out.println("\n9. Escribe un programa que implemente la operación lógica XOR (o exclusivo) entre dos booleanos.");
        primitivo.xor(true, true);
        primitivo.xor(false, false);
        primitivo.xor(false, true);

        // Ejercicio 10
        System.out.println("\n10. Escribe un programa que convierta un carácter en minúscula a mayúscula y viceversa.");
        primitivo.converTypeCase('A');
        primitivo.converTypeCase('s');


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

        // Ejercicio 3
        System.out.println("\n3. Escribe un programa que sume todos los elementos de un arreglo de enteros.");
        int[] arregloInt = {5, 7, 8, 10, 2, 10, 6};
        arreglo.sumarElementosArreglo(arregloInt);

        // Ejercicio 4
        System.out.println("\n4. Escribe un programa que encuentre el elemento más grande en un arreglo de enteros.");
        int[] arregloInt2 = {5, 7, 8, 10, 2, 6};
        arreglo.numeroMayor(arregloInt2);

        // Ejercicio 5
        System.out.println("\n5. Escribe un programa que encuentre el elemento más pequeño en un arreglo de enteros.");
        arreglo.numeroMenor(arregloInt2);

        // Ejercicio 6
        System.out.println("\n6. Escribe un programa que verifique si un arreglo de enteros contiene elementos duplicados.");
        arreglo.containDuplicate(arregloInt2);
        arreglo.containDuplicate(arregloInt);

        // Ejercicio 7
        System.out.println("\n7. Escribe un programa que invierta el orden de los elementos en un arreglo.");
        arreglo.inverterArray(arregloInt2);



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