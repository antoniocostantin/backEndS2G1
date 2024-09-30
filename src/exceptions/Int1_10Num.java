package exceptions;

public class Int1_10Num extends RuntimeException {
    public Int1_10Num(int num) {
        super(num + "deve essere compreso tra 1 e 10");
    }
}
