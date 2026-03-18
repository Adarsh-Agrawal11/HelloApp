 public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Join names directly
        String names = String.join(", ", args);

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}