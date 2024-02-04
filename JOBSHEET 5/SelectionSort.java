import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(numbers));
        selectionSort(numbers);
    }

    private static void selectionSort(int[] numbers) {
        int length = numbers.length;

        for (int i = 0; i < length; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            for (int j = 0; j < length; j++) {
                
            }
        }
    }
}
