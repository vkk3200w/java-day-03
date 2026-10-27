
public class StringManipulation {
    public static void main(String[] args) {
        String name = "  Kishore Kumar  ";
        String cleanName = name.trim();

        System.out.println("Original: " + name);
        System.out.println("Trimmed: " + cleanName);
        System.out.println("Length: " + cleanName.length());
        System.out.println("Uppercase: " + cleanName.toUpperCase());
        System.out.println("Lowercase: " + cleanName.toLowerCase());
        System.out.println("Contains Kumar: " + cleanName.contains("Kumar"));
        System.out.println("First Character: " + cleanName.charAt(0));
        System.out.println("Equals Kishore: " + cleanName.equals("Kishore"));

        String reversed = "";

        for (int i = cleanName.length() - 1; i >= 0; i--) {
            reversed += cleanName.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}
