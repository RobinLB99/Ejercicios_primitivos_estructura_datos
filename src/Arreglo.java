import java.sql.SQLOutput;
import java.util.Arrays;

public class Arreglo {

    /**
     * Escribe un programa que encuentre el número más grande
     * en un arreglo de int.
     */
    public void encontrarMayor() {
        int[] arr = {54, 75, 100, 50, 68, 101, 20};
        int mayor = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (mayor < arr[i]) mayor = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("El numero mayor es: " + mayor);
    }

    /**
     * Escribe un programa que invierta un arreglo de char.
     */
    public void invertirArrChar() {
        char[] arrChar = {'a', 'b', 'c', 'd', 'e'};
        int Inicio = 0;
        int Final = arrChar.length - 1;

        System.out.println("Inicial: " + Arrays.toString(arrChar));

        while (Inicio < Final) {
            char temp = arrChar[Inicio];
            arrChar[Inicio] = arrChar[Final];
            arrChar[Final] = temp;

            Inicio++;
            Final--;
        }

        System.out.println("Final: " + Arrays.toString(arrChar));
    }

    /**
     * Escribe un programa que sume todos los elementos de un arreglo de enteros.
     */
    public void sumarElementosArreglo(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println("La suma de los enteros del arreglo es: " + suma);
    }

    /**
     * Escribe un programa que encuentre el elemento más grande en un arreglo de enteros.
     */
    public void numeroMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) mayor = arreglo[i];
        }
        System.out.println("El numero mayor es: " + mayor);
    }

    /**
     * Escribe un programa que encuentre el elemento más pequeño en un arreglo de enteros.
     */
    public void numeroMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) menor = arreglo[i];
        }
        System.out.println("El numero menor es: " + menor);
    }

    /**
     * Escribe un programa que verifique si un arreglo de enteros contiene
     * elementos duplicados.
     */
    public void containDuplicate(int[] arreglo) {
        Boolean isDuplicate = false;
        Integer numDuplicate = null;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (i != j && arreglo[i] == arreglo[j]) {
                    isDuplicate = true;
                    numDuplicate = arreglo[j];
                }
            }
        }
        if (isDuplicate) System.out.println("El numero " + numDuplicate + " esta duplicado.");
        else System.out.println("No existen elementos duplicados.");
    }

    /**
     * Escribe un programa que invierta el orden de los elementos en un arreglo.
     */
    public void inverterArray(int[] arreglo) {
        System.out.println("Original: " + Arrays.toString(arreglo));

        Integer temp = null;
        int start = 0;
        int end = arreglo.length - 1;

        while (start < end) {
            temp = arreglo[start];
            arreglo[start] = arreglo[end];
            arreglo[end] = temp;

            start++;
            end--;
        }

        System.out.println("Invertido: " + Arrays.toString(arreglo));
    }
}
