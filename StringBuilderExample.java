
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder("Java");

        message.append(" Programming");
        System.out.println("After Append: " + message);

        message.insert(5, "Language ");
        System.out.println("After Insert: " + message);

        message.replace(5, 13, "Coding");
        System.out.println("After Replace: " + message);

        message.delete(5, 11);
        System.out.println("After Delete: " + message);

        message.reverse();
        System.out.println("After Reverse: " + message);

        String finalText = message.toString();
        System.out.println("String Value: " + finalText);
    }
}
