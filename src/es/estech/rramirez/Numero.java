package es.estech.rramirez;

public class Numero implements Operaciones {
    private String numero;
    private int longitud;

    public Numero(int numero) {
        this.numero = String.valueOf(numero);
        this.longitud = String.valueOf(numero).length();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = String.valueOf(numero);
    }

    public int getLongitud() {
        return longitud;
    }

    @Override
    public boolean esCapicua() {
        boolean capicua = true;
        for (int i = 0; i < (this.longitud - 1) / 2; i++) {
            if (this.numero.charAt(i) != this.numero.charAt(this.longitud - 1 - i)) {
                capicua = false;
                break;
            }
        }
        return capicua;
    }

    @Override
    public boolean esPar() {
        if (Integer.parseInt(this.numero) % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean esDivisiblePor3() {
        if (Integer.parseInt(this.numero) % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
