import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, posizione;
        boolean continua = true;
        int[] numArr = getRandomArray(5);
        printArray(numArr);

        do{
            System.out.println("Inserisci un numero");
                num = sc.nextInt();
            if (num != 0) {
                System.out.println("Inserire la posizione in cui inserire il numero");
                posizione = sc.nextInt();
                try {
                    numArr[posizione - 1] = num;
                    printArray(numArr);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Posizione fuori dal limite dell'array: " + posizione);
                }
            } else {
                continua = false;
            }
        } while (continua);

    }
    public static int[] getRandomArray( int num) {
        int[] arr = new int[num];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 11);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i +1 + ": " + arr[i]);
        }
    }
}