import java.util.Scanner;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            String type = in.next();
            if (type.equals("Insert")) {
                int x = in.nextInt();
                int y = in.nextInt();
                list.add(x, y);
            } else if (type.equals("Delete")) {
                int x = in.nextInt();
                list.remove(x);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " "));
        }
        in.close();
    }
}