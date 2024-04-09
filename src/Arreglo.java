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

        System.out.println(String.valueOf(arr));
        System.out.println("El numero mayor es: " + mayor);
    }

    /**
     * Escribe un programa que invierta un arreglo de char.
     */
    public void invertirArrChar() {
        char[] arrChar = {'a', 'b', 'c', 'd', 'e'};
        int Inicio = 0;
        int Final = arrChar.length - 1;

        System.out.println("Inicial: " + String.copyValueOf(arrChar));

        while (Inicio < Final) {
            char temp = arrChar[Inicio];
            arrChar[Inicio] = arrChar[Final];
            arrChar[Final] = temp;

            Inicio++;
            Final--;
        }

        System.out.println("Final: " + String.copyValueOf(arrChar));
    }
}
