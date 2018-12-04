package es.estech.rramirez;

import java.util.Scanner;

public class Validar {
    static int validate(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        return sc.nextInt();
    }
}
