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

    /**
     * Escribe un programa que calcule el promedio de todos los elementos de un
     * arreglo de enteros.
     */
    public void promedio(int[] arreglo) {
        float promedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            promedio += arreglo[i];
        }
        promedio = promedio / arreglo.length;
        System.out.println("El promedio del arreglo '" + Arrays.toString(arreglo) + "' es: " + promedio);
    }

    /**
     * Escribe un programa que encuentre el elemento que aparece más veces en
     * un arreglo de enteros.
     */
    public void frecuente(int[] arreglo) {
        int frecuente = 0;
        int count = 0;
        for (int i = 0; i < arreglo.length; i++) {
            int tempCount = 0;
            for (int j = 1; j < arreglo.length; j++) {
                if (i != j && arreglo[i] == arreglo[j]) {
                    tempCount += 1;
                }
            }
            if (count < tempCount) {
                frecuente = arreglo[i];
                count = tempCount;
            }
        }

        System.out.println(Arrays.toString(arreglo));
        System.out.println("El elemento mas frecuente es: " + frecuente);
    }

    /**
     * Escribe un programa que verifique si un arreglo de enteros está ordenado
     * de menor a mayor.
     */
    public void isSorted(int[] arreglo) {
        int[] temp = arreglo.clone();
        Arrays.sort(temp);

        String isSorted = Arrays.equals(arreglo, temp)
                ? "El arreglo esta ordenado de menor a mayor."
                : "El arreglo no esta ordenado de menor a mayor.";

        System.out.println(Arrays.toString(arreglo));
        System.out.println(isSorted);
    }

    /**
     * Escribe un programa que ordene alfabéticamente un arreglo de cadenas.
     */
    public void sortStrings(String[] cadena) {
        System.out.println("Array: " + Arrays.toString(cadena));
        String[] temp = cadena.clone();
        Arrays.sort(temp);
        System.out.println("Ordenado: " + Arrays.toString(temp));
    }

    /**
     * Escribe un programa que sume dos matrices representadas como arreglos
     * bidimensionales.
     */
    public void sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] temp = new int[2][3];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                temp[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz 1: " + Arrays.deepToString(matriz1));
        System.out.println("Matriz 2: " + Arrays.deepToString(matriz2));
        System.out.println("La matriz resultante de la suma de las dos matrices es: " + Arrays.deepToString(temp));
    }

    /**
     * Escribe un programa que cuente el número de true en un arreglo de booleanos.
     */
    public void countTrue(boolean[] arreglo) {
        int count = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]) count += 1;
        }
        System.out.println("Arreglo: " + Arrays.toString(arreglo));
        System.out.println("El numero de booleanos 'true' es: " + count);
    }

    /**
     * Escribe un programa que genere un arreglo con los primeros n
     * números primos.
     */
    public void generarPrimos(int generar) {

    }

    /**
     * Escribe un programa que genere un arreglo con los primeros n
     * números de la serie de Fibonacci.
     */
    public void generarFibinacci(int generar) {
        int anterior = -1;
        int actual = 1;
        Integer temp;

        int[] arreglo = new int[generar];

        for (int inArray = 0; inArray < generar; inArray++) {
            temp = actual;
            actual = anterior + actual;
            arreglo[inArray] = actual;
            anterior = temp;
        }

        System.out.println("Fibonacci array: " + Arrays.toString(arreglo));
    }

    /**
     * Escribe un programa que separe los números pares e impares de un
     * arreglo dado en dos arreglos diferentes.
     */
    public void separateParImpar(int[] arreglo) {
        int parCount = 0;
        int imparCount = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                parCount++;
            } else {
                imparCount++;
            }
        }

        int[] par = new int[parCount];
        int[] impar = new int[imparCount];

        int indexPar = 0;
        int indexImpar = 0;

        for (int index = 0; index < arreglo.length; index++) {
            if (arreglo[index] % 2 == 0) {
                par[indexPar] = arreglo[index];
                indexPar++;
            } else {
                impar[indexImpar] = arreglo[index];
                indexImpar++;
            }
        }

        System.out.println("Par: " + Arrays.toString(par));
        System.out.println("Impar: " + Arrays.toString(impar));
    }
}
