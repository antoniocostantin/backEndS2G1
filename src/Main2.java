import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Inserire i kilometri percorsi: ");
            int km = scanner.nextInt();
            System.out.print("Inserire i litri di benzina consumati: ");
            double liters = scanner.nextInt();

            double kmLiter = km / liters;

            if (Double.isInfinite(kmLiter)) {
                throw new ArithmeticException("Non si può dividere per zero!");
            }

            System.out.println("L'auto percorre " + kmLiter + "km al litro");


        } catch(
                ArithmeticException e){
            System.out.println("Impossibile che la tua macchina non consumi carburante, controlla i litri inseriti");
            e.getMessage();
        } finally{
            scanner.close();
        }
    }
}
