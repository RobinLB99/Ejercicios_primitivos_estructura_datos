public class Primitivo {

    // TIPOS DE DATOS PRIMITIVOS ----------------------------------------

    /**
     * Escribe un programa que sume, reste, multiplique y divida dos
     * números enteros (int).
     */
    public void resultado(int num1, int num2, String operacion) {
        int resultado = 0;
        if (operacion.equals("sumar")) {
            resultado = num1 + num2;
            System.out.println("Suma: " + resultado);
        }

        if (operacion.equals("restar")) {
            resultado = num1 - num2;
            System.out.println("Restar: " + resultado);
        }

        if (operacion.equals("multiplicar")) {
            resultado = num1 * num2;
            System.out.println("Multiplicar: " + resultado);
        }

        if (operacion.equals("dividir")) {
            resultado = num1 / num2;
            System.out.println("Dividir: " + resultado);
        }
    }

    /**
     * Escribe un programa que compare dos números de punto
     * flotante (float o double).
     */
    public void compararFlotantes(double num1, double num2) {
        if (num1 == num2) {
            System.out.println(num1 + " es igual a " + num2);
        } else {
            System.out.println(num1 + " no es igual a " + num2);
        }
    }
}
