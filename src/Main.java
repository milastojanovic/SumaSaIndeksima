import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] stringArray = input.split(",");

        Integer[] array = new Integer[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.valueOf(stringArray[i]);
        }

        if (array.length >= 10000) {
            throw new IllegalArgumentException("Illegal argument: too many numbers");
        }

        int sum = 0;

        // calculate sum
        for (int i = 0; i < array.length; i++) {
            sum = sum + i * array[i];
        }

        System.out.println(sum);
    }
}
