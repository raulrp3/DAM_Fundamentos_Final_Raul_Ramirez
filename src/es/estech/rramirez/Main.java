package es.estech.rramirez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        Numero numero;
        System.out.print("Introduce un número: ");
        num = Validar.validate(sc);
        numero = new Numero(num);
        if (numero.getLongitud() == 1) {
            System.out.println("El número es divisible por 3: " + numero.esDivisiblePor3());
        }
        if (numero.getLongitud() >= 2 && numero.getLongitud() <= 3) {
            System.out.println("El número es capicúa: " + numero.esCapicua());
        }
        if (numero.getLongitud() >= 3) {
            System.out.println("El número es par: " + numero.esPar());
        }
    }
}
