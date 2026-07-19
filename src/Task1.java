import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            ArrayList<Integer> currentLine = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                currentLine.add(in.nextInt());
            }
            lines.add(currentLine);
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            int rowIndex = x - 1;
            int colIndex = y - 1;

            if (rowIndex >= 0 && rowIndex < lines.size() &&
                    colIndex >= 0 && colIndex < lines.get(rowIndex).size()) {
                System.out.println(lines.get(rowIndex).get(colIndex));
            } else {
                System.out.println("ERROR!");
            }
        }
        in.close();
    }
}