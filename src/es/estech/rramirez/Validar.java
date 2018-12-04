package es.estech.rramirez;

import java.util.Scanner;
//Clase en la que se declaran los métodos para realizar validaciones
public class Validar {
    //Método para validar un número entero
    static int validate(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        return sc.nextInt();
    }
}
