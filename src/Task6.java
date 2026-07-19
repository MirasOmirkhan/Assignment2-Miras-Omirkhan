import java.util.Scanner;
import java.util.Arrays;

public class Task6 {

    public static void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;


        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }


        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }


        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;

            // Рекурсивно применяем heapify к поддереву
            heapify(arr, n, smallest);
        }
    }


    public static void buildHeap(int[] arr) {
        int n = arr.length;
        // Начинаем с последнего нелистового узла и идем вверх
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("For example: 4 10 3 5 1):");
        if (in.hasNextLine()) {
            String line = in.nextLine();
            String[] tokens = line.trim().split("\\s+");

            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            System.out.println("Source array: " + Arrays.toString(arr));


            buildHeap(arr);

            System.out.println("Min-Heap: " + Arrays.toString(arr));
        }

        in.close();
    }
}