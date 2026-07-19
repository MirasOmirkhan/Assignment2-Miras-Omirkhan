import java.util.Scanner;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) return;

        int n = in.nextInt();
        LinkedList<Integer> shelf = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int operation = in.nextInt();
            if (operation == 1) {
                shelf.addFirst(in.nextInt());
            } else if (operation == 2) {
                shelf.addLast(in.nextInt());
            } else if (operation == 3) {
                System.out.println(shelf.removeFirst());
            } else if (operation == 4) {
                System.out.println(shelf.removeLast());
            }
        }
        in.close();
    }
}