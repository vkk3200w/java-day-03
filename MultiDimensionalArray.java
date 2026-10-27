
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] marks = {
            {85, 90, 88},
            {78, 82, 80},
            {92, 95, 89}
        };

        for (int i = 0; i < marks.length; i++) {
            int total = 0;

            System.out.print("Student " + (i + 1) + " Marks: ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
                total += marks[i][j];
            }

            System.out.println();
            System.out.println("Total: " + total);
        }
    }
}
