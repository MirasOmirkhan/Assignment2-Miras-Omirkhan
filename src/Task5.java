import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        if (!in.hasNextInt()) return;
        int n = in.nextInt();


        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(in.nextInt());
        }


        int[] samsas = new int[n];
        for (int i = 0; i < n; i++) {
            samsas[i] = in.nextInt();
        }

        int samsaIndex = 0;
        int rotations = 0;


        while (!queue.isEmpty() && rotations < queue.size()) {
            if (queue.peek() == samsas[samsaIndex]) {
                queue.poll();
                samsaIndex++;
                rotations = 0;
            } else {
                queue.add(queue.poll());
                rotations++;
            }
        }


        System.out.println(queue.size());

        in.close();
    }
}