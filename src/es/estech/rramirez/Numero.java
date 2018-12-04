package es.estech.rramirez;

//Clase Número en la que se implementa la interfaz
public class Numero implements Operaciones {
    private String numero;//Almacena el número sobre el que deseamos realizar las operaciones
    private int longitud;//Almacena la longitud de dicho número

    //Constructor en el que se le pasa unnúmero entero
    public Numero(int numero) {
        this.numero = String.valueOf(numero);
        this.longitud = String.valueOf(numero).length();
    }

    //Getters y setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = String.valueOf(numero);
    }

    public int getLongitud() {
        return longitud;
    }

    //Método esCapicua que comprueba si dicho número lo es
    @Override
    public boolean esCapicua() {
        boolean capicua = true;
        //Recorremos las posiciones del número desde 0 hasta la mitad de su longitud y vamos comparando con el final
        for (int i = 0; i < (this.longitud - 1) / 2; i++) {
            if (this.numero.charAt(i) != this.numero.charAt(this.longitud - 1 - i)) {
                capicua = false;
                break;
            }
        }
        return capicua;
    }

    //Método esPar que comprueba si dicho número lo es
    @Override
    public boolean esPar() {
        //Si el módulo del número entre 2 es 0, el número es par
        if (Integer.parseInt(this.numero) % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Método esDivisiblePor3 que comprueba si el número lo es
    @Override
    public boolean esDivisiblePor3() {
        //Si el módulo del número entre 3 es 0, el número es divisible por 3
        if (Integer.parseInt(this.numero) % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
