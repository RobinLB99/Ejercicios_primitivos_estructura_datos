import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    /**
     * Escribe un programa que calcule el factorial de un número entero.
     */
    public void factorial(int num) {
        int fact = num - 1;

        while (fact > 0) {
            num = num * fact;
            fact--;
        }

        System.out.println("El factorial es: " + num);
    }

    /**
     * Escribe un programa que calcule el área de un círculo dado su
     * radio (usa Math.PI para el valor de pi).
     */
    public void areaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo de radio " + radio + " es: " + area);
    }

    /**
     * Escribe un programa que convierta grados Fahrenheit a Celsius.
     */
    public void convertToCelcius(float Fahrenheit) {
        float Celsius = (Fahrenheit - 32) * 5/9;
        System.out.println(Fahrenheit + "° C es igual a " +  Celsius + " °C");
    }

    /**
     * Escribe un programa que compare dos números enteros y devuelva
     * true si son iguales y false si no lo son.
     */
    public void isEquals(int num1, int num2) {
        if (num1 == num2) System.out.println("Los numero son iguales: True");
        else System.out.println("No son iguales: False");
    }

    /**
     * Escribe un programa que verifique si un carácter es una vocal
     * o una consonante.
     */
    public void isVocal(char caracter) {
        Pattern pattern = Pattern.compile("^[aeiouAEIOU]$");
        Matcher match = pattern.matcher(String.valueOf(caracter));

        if (match.find()) System.out.println("Es una vocal");
        else System.out.println("No es una vocal");
    }
}
