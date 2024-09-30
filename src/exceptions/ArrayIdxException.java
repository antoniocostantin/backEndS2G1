package exceptions;

public class ArrayIdxException extends Exception {

    public ArrayIdxException(int num) {
        super("Indice dell'array fuori portata : " + num + "non è un indice dell'array");
    }

    public ArrayIdxException(double num) {
        super("Indice dell'array fuori portata : " + num + "dve essere un numero intero");
    }
}
