import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("\nBefore : ");
        printArray(numbers);

        // Sorting algorithm
        boolean swappedSomething = true;
        
        while (swappedSomething) {
            swappedSomething = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter  : ");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

// misal e var numbers iku [5,4,3,2,1] brarti length e kan 5

// nde awal definisi var swapped value ne true.
// terus njalanno while ketika swapped bernilai true

// nde njero while, teko awal swapped e di replace dadi false

// terus menjalankan perulangan for(literasi sebanyak 4x (5-1))


// #literasi 1

// terus ono kondisi if numbers[i] > numbers[i+1]

// numbers[i] > numbers[i+1]
//    5	   >      4

// jika true maka swapped sing bar di replace false, saiki direplace dadi true maneh.
// terus ono inisialisasi var temp = numbers[i];

// //fungsi var temp iki gawe menyimpan sementara
// var temp = numbers[i];
// var temp = numbers[0] => 5

// // iki operasi sorting
// numbers[i] = numbers[i+1];
// numbers[0] =  numbers[0+1] => numbers[1] => 4

// // iki finalisasi sorting
// numbers[i+1] = temp;
// numbers[0+1] => numbers[1] = 5

// nah iki kabeh engko di ulang sampe swapped bernilai false dan terakhir pasti hasil e var number dadi [1,2,3,4,5]