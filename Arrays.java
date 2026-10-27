
public class Arrays {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};

        int sum = 0;
        int max = marks[0];

        System.out.println("Student Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);

            sum += marks[i];

            if (marks[i] > max) {
                max = marks[i];
            }
        }

        double average = (double) sum / marks.length;

        System.out.println("Total Marks: " + sum);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + max);

        marks[0] = 95;

        System.out.println("Updated First Mark: " + marks[0]);
    }
}
